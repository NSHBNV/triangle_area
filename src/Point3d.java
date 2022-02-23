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
}
