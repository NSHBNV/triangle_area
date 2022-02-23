import java.awt.*;
import java.util.Scanner;


public class Lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y, z;
        System.out.println("Введите x, y, z координаты первой точки по очереди:");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d point1 = new Point3d(x, y, z);

        System.out.println("Введите x, y, z координаты второй точки по очереди:");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d point2 = new Point3d(x, y, z);

        System.out.println("Введите x, y, z координаты третьей точки по очереди:");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d point3 = new Point3d(x, y, z);

    }

    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double a, b, c, p;

        a = point1.distanceTo(point2);
        b = point2.distanceTo(point3);
        c = point3.distanceTo(point1);
        p = a + b + c;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
