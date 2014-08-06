package org.eclipse.gef4.kgraph.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.gef4.kgraph.KGraphPackage;

public class KGraphUtil {

	/**
	 * A {@link Copier} that deep-copies attribute values (for those attributes
	 * type used in the context of an KGraph
	 * 
	 * @author anyssen
	 *
	 */
	public static class KGraphCopier extends Copier {

		private static final long serialVersionUID = 1980565034305506507L;

		@Override
		protected void copyAttributeValue(EAttribute eAttribute,
				EObject eObject, Object value, Setting setting) {
			Object copiedValue = value;
			if (KGraphPackage.eINSTANCE.getKShapeLayout_Position().equals(
					eAttribute)) {
				copiedValue = copyValue(value);
			} else if (KGraphPackage.eINSTANCE.getKShapeLayout_Size().equals(
					eAttribute)) {
				copiedValue = copyValue(value);
			}
			// TODO other attributes of layouts that use Point and Dimension
			else if (KGraphPackage.eINSTANCE.getKGraphElement_Data().equals(
					eAttribute)) {
				// Do we really want to deep-copy the data value? If so, uncopy the following
				// copiedValue = copyValues((Collection<?>) value);
			}
			super.copyAttributeValue(eAttribute, eObject, copiedValue, setting);
		}

		protected Object copyValue(Object value) {
			if (value instanceof EObject) {
				return EcoreUtil.copy((EObject) value);
			}
			// handle copying via serialization (if instanceof Serializable)
			else if (value instanceof Cloneable) {
				try {
					Method cloneMethod = value.getClass().getMethod("clone",
							new Class<?>[] {});
					cloneMethod.setAccessible(true);
					return cloneMethod.invoke(value, new Object[] {});
				} catch (Exception e) {
					return value;
				}
			}
			return value;
		}

		public Object copyValues(Collection<?> values) {
			// use EcoreUtil#copyAll() for a collection of EObjects
			if (filter(values, EObject.class).size() == values.size()) {
				return EcoreUtil.copyAll(values);
			}
			// TODO: handle copying via serialization for the complete set (if
			// all are serializable)
			return values;
		}

		@SuppressWarnings("unchecked")
		private static <T> Collection<T> filter(Collection<?> values,
				Class<T> type) {
			List<T> filtered = new ArrayList<T>();
			for (Object value : values) {
				if (type.isInstance(value)) {
					filtered.add((T) value);
				}
			}
			return filtered;
		}
	}

	// transferred from EcoreUtil, modified T parameter (no longer extends
	// EObject) and replaced Copier
	public static <T> T copy(T eObject) {
		Copier copier = new KGraphCopier();
		EObject result = copier.copy((EObject) eObject);
		copier.copyReferences();

		@SuppressWarnings("unchecked")
		T t = (T) result;
		return t;
	}

	// transferred from EcoreUtil and replaced Copier
	public static <T> Collection<T> copyAll(Collection<? extends T> eObjects) {
		Copier copier = new KGraphCopier();
		Collection<T> result = copier.copyAll(eObjects);
		copier.copyReferences();
		return result;
	}
}
