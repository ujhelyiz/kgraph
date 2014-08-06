package org.eclipse.gef4.kgraph.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef4.geometry.planar.Dimension;
import org.eclipse.gef4.geometry.planar.Point;
import org.eclipse.gef4.kgraph.KEdge;
import org.eclipse.gef4.kgraph.KGraphFactory;
import org.eclipse.gef4.kgraph.KNode;
import org.eclipse.gef4.kgraph.util.KGraphUtil;
import org.junit.Test;

public class CopyTests {

	@Test
	public void copyNode() {
		// deep copying of point and dimensions (attributes) is not performed by
		// EcoreUtil.Copier, which will simply reuse-the references. We need a
		// KGraphCopier for this, which deep-copies Point and Dimension
		// attribute values.
		KNode n1 = createNode("n1", /* Use an emf object as data */
				createNode("n1Data", null, null, null), new Point(50, 60),
				new Dimension(70, 80));
		System.out.println(printNode(n1));
		KNode n1Copy = KGraphUtil.copy(n1);
		System.out.println(printNode(n1Copy));

		// check copy is equal
		TestCase.assertTrue(n1.getId().equals(n1Copy.getId()));
		TestCase.assertTrue(n1.getPosition().equals(n1Copy.getPosition()));
		TestCase.assertTrue(n1.getSize().equals(n1Copy.getSize()));
		TestCase.assertTrue(EcoreUtil.equals((EObject) n1.getData().get(0),
				(EObject) n1Copy.getData().get(0)));

		// modify copy
		n1Copy.setId("n2");
		n1Copy.getPosition().x = 55;
		n1Copy.getPosition().y = 66;
		n1Copy.getSize().width = 77;
		n1Copy.getSize().height = 88;
		((KNode) n1Copy.getData().get(0)).setId("n1CopyData");
		System.out.println(printNode(n1));
		System.out.println(printNode(n1Copy));

		// check copy is no longer equal
		TestCase.assertFalse(n1.getId().equals(n1Copy.getId()));
		TestCase.assertFalse(n1.getPosition().equals(n1Copy.getPosition()));
		TestCase.assertFalse(n1.getSize().equals(n1Copy.getSize()));
		// do we want to deep copy the values (if so, uncomment the copying of values for data)
//		TestCase.assertFalse(EcoreUtil.equals((EObject) n1.getData().get(0),
//				(EObject) n1Copy.getData().get(0)));
	}

	@Test
	public void copyCollection() {
		KNode n1 = createNode("n1", "n1Data", new Point(50, 50), new Dimension(
				50, 50));
		KNode n2 = createNode("n1", "n1Data", new Point(150, 150),
				new Dimension(150, 150));
		KEdge e1 = createEdge("e1", n1, n2);
		
		List<EObject> collection = new ArrayList<EObject>();
		collection.add((EObject) n1);
		collection.add((EObject) n2);

		System.out.println(printEdge(e1));

		Collection<EObject> copiedCollection = KGraphUtil.copyAll(collection);
		KNode n1Copy = (KNode) copiedCollection.iterator().next();
		KEdge e1Copy = n1Copy.getOutgoingEdges().iterator().next();
		KNode n2Copy = e1Copy.getTargetNode();

		System.out.println(printEdge(e1Copy));
	}

	private String printEdge(KEdge e1) {
		return e1.getId() + ": " + printNode(e1.getSourceNode()) + " -> "
				+ printNode(e1.getTargetNode());
	}

	private String printNode(KNode n1) {
		return n1.getId() + /* " - " + n1.getData().get(0).toString() + */" ["
				+ n1.getPosition().x + ", " + n1.getPosition().y + ", "
				+ n1.getSize().width + ", " + n1.getSize().height + "]";
	}

	private KEdge createEdge(String id, KNode n1, KNode n2) {
		KEdge edge = KGraphFactory.eINSTANCE.createKEdge();
		edge.setId(id);
		edge.setSourceNode(n1);
		TestCase.assertTrue(n1.getOutgoingEdges().contains(edge));
		edge.setTargetNode(n2);
		TestCase.assertTrue(n2.getIncomingEdges().contains(edge));
		return edge;
	}

	private KNode createNode(String id, Object data, Point position,
			Dimension size) {
		KNode node = KGraphFactory.eINSTANCE.createKNode();
		node.setId(id);
		node.getData().add(data);
		node.setPosition(position);
		node.setSize(size);
		return node;
	}

}
