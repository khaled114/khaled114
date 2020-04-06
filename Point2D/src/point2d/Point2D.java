/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point2d;

/**
 *
 * @author k-119
 */
public class Point2D {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double dist2D(Point2D p) {
        double distance = Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
        return distance;
    }

    public void printDistance(double d) {
        System.out.println("2D distance = " + (int) Math.ceil(d));
    }
}

class Point3D extends Point2D{
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public double dist3D(Point3D p) {
        double distance = Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2)+ Math.pow((p.z - z), 2));
        return distance;
    }
    public void printDistance(double d) {
        System.out.println("3D distance = " + (int) Math.ceil(d));
    }
}
