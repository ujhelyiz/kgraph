package org.eclipse.gef4.kgraph.tests;

import junit.framework.TestCase;

import org.eclipse.gef4.geometry.planar.Dimension;
import org.eclipse.gef4.geometry.planar.Point;
import org.eclipse.gef4.kgraph.KGraphFactory;
import org.eclipse.gef4.kgraph.KGraphPackage;
import org.junit.Test;

public class SerializeParseTests {

	@Test
	public void serializeAndParsePoint() {
		TestCase.assertEquals(new Point(10.64, 20.763), fromPointString(toPointString(new Point(10.64, 20.763))));
	}
	
	@Test
	public void serializeAndParseDimension() {
		TestCase.assertEquals(new Dimension(10.64, 20.763), fromDimensionString(toDimensionString(new Dimension(10.64, 20.763))));
	}

	private String toPointString(Point p) {
		return KGraphFactory.eINSTANCE.convertToString(
				KGraphPackage.eINSTANCE.getPoint(), p);
	}

	private Point fromPointString(String s) {
		return (Point) KGraphFactory.eINSTANCE.createFromString(
				KGraphPackage.eINSTANCE.getPoint(), s);
	}
	
	private String toDimensionString(Dimension d) {
		return KGraphFactory.eINSTANCE.convertToString(
				KGraphPackage.eINSTANCE.getDimension(), d);
	}

	private Dimension fromDimensionString(String s) {
		return (Dimension) KGraphFactory.eINSTANCE.createFromString(
				KGraphPackage.eINSTANCE.getDimension(), s);
	}

}
