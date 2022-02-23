public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Введите x, y, z координаты первой точки по очереди:");
        Point3d point1 = new Point3d(
                Double.parseDouble(args[0]),
                Double.parseDouble(args[1]),
                Double.parseDouble(args[2]));

        System.out.println("Введите x, y, z координаты второй точки по очереди:");
        Point3d point2 = new Point3d(
                Double.parseDouble(args[3]),
                Double.parseDouble(args[4]),
                Double.parseDouble(args[5]));

        System.out.println("Введите x, y, z координаты третьей точки по очереди:");
        Point3d point3 = new Point3d(
                Double.parseDouble(args[6]),
                Double.parseDouble(args[7]),
                Double.parseDouble(args[8]));

        if (point1.compareWith(point2) || point2.compareWith(point3) || point3.compareWith(point1))
            System.out.println("Некорректный ввод. Две или более точек имеют одинаковые координаты");
        else
            System.out.println(computeArea(point1, point2, point3));
    }

    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double a, b, c, p;

        a = point1.distanceTo(point2);
        b = point2.distanceTo(point3);
        c = point3.distanceTo(point1);
        p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
