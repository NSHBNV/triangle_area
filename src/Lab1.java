public class Lab1 {
    public static void main(String[] args) {
        //Получаем в качестве параметров значения координат точки и вызываем конструкторы
        Point3d point1 = new Point3d(
                Double.parseDouble(args[0]),
                Double.parseDouble(args[1]),
                Double.parseDouble(args[2]));

        Point3d point2 = new Point3d(
                Double.parseDouble(args[3]),
                Double.parseDouble(args[4]),
                Double.parseDouble(args[5]));

        Point3d point3 = new Point3d(
                Double.parseDouble(args[6]),
                Double.parseDouble(args[7]),
                Double.parseDouble(args[8]));

        //Сравниваем координаты точек и либо выводим результат, либо ошибку
        if (point1.compareWith(point2) || point2.compareWith(point3) || point3.compareWith(point1))
            System.out.println("Incorrect input. Two or three points have same values.");
        else
            System.out.println(computeArea(point1, point2, point3));
    }

    // Вычисляем площадь треугольника
    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double a, b, c, p;

        a = point1.distanceTo(point2);
        b = point2.distanceTo(point3);
        c = point3.distanceTo(point1);
        p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
