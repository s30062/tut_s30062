package com.tut2.s30062;

import junit.framework.TestCase;

public class ShapeTest extends TestCase {

    public void testSphereArea() {
        IShape sphere = new Sphere(5);


        assertEquals(314.159, sphere.calculateArea(), 0.001);
    }

    public void testSphereVolume() {

        IShape sphere = new Sphere(5);

        assertEquals(523.598, sphere.calculateVolume(), 0.001);
    }

    public void testCylinderArea() {
        IShape cylinder = new Cylinder(3, 7);

        assertEquals(188.496, cylinder.calculateArea(), 0.001);
    }

    public void testCylinderVolume() {
        IShape cylinder = new Cylinder(3, 7);

        assertEquals(197.920, cylinder.calculateVolume(), 0.001);
    }

    public void testRectangleArea() {
        IShape rectangle = new Rectangle(4, 8);
        assertEquals(32.0, rectangle.calculateArea(), 0.001);
    }

    public void testRectangleVolume() {
        IShape rectangle = new Rectangle(4, 8);
        assertEquals(0.0, rectangle.calculateVolume(), 0.001);
    }

    public void testCubeArea() {

        IShape cube = new Cube(4);

        assertEquals(96.0, cube.calculateArea(), 0.001);
    }

    public void testCubeVolume() {
        IShape cube = new Cube(4);

        assertEquals(64.0, cube.calculateVolume(), 0.001);
    }
    public void testNegativeRadiusSphere() {
        try {
            new Sphere(-5);
            fail("expected argument exception");
        } catch (IllegalArgumentException e) {
            System.err.println("exception");
        }
    }

}
