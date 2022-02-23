import java.text.DecimalFormat;

// Класс трехмерной точки
public class Point3d {
    // Далее описаны x, y, z координаты
    private double xCoord;
    private double yCoord;
    private double zCoord;

    // Конструктор по умолчанию
    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    // Конструктор инициализации
    public Point3d(double x, double y, double z) {
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }

    // Метод получения поля X
    public double getxCoord() {
        return xCoord;
    }

    // Метод получения поля Y
    public double getyCoord() {
        return yCoord;
    }

    // Метод получения поля Z
    public double getzCoord() {
        return zCoord;
    }

    // Метод установки значения X
    public void setxCoord(double x) {
        this.xCoord = x;
    }

    // Метод установки значения Y
    public void setyCoord(double y) {
        this.yCoord = y;
    }

    // Метод установки значения Z
    public void setzCoord(double z) {
        this.zCoord = z;
    }

    // Реализация метода высчитывающего расстояние между двумя точками
    public double distanceTo(Point3d point) {
        return Math.sqrt(Math.pow(this.xCoord - point.xCoord, 2) + Math.pow(this.yCoord - point.yCoord, 2) +
                Math.pow(this.zCoord - point.zCoord, 2));
    }
}
