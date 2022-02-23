import java.math.BigDecimal;
import java.math.RoundingMode;

// Класс трехмерной точки
public class Point3d extends Point2d {
    // Далее описана z координата
    private double zCoord;

    // Конструктор по умолчанию
    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    // Конструктор инициализации
    public Point3d(double x, double y, double z) {
        super(x, y);
        this.zCoord = z;
    }

    // Метод получения поля Z
    public double getzCoord() {
        return zCoord;
    }

    // Метод установки значения Z
    public void setzCoord(double z) {
        this.zCoord = z;
    }

    // Метод проверки на равенство двух объектов Point3d
    public boolean compareWith(Point3d point) {
        return this.xCoord == point.xCoord && this.yCoord == point.yCoord && this.zCoord == point.zCoord;
    }

    // Реализация метода высчитывающего расстояние между двумя точками
    public double distanceTo(Point3d point) {
        double d = Math.sqrt(Math.pow(this.xCoord - point.xCoord, 2) + Math.pow(this.yCoord - point.yCoord, 2) +
                Math.pow(this.zCoord - point.zCoord, 2));
        BigDecimal bd = new BigDecimal(Double.toString(d));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
