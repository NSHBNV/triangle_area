//Двумерный класс точки
public class Point2d {
    //Координата X
    protected double xCoord;
    //Координата Y
    protected double yCoord;

    //Конструктор инициализации
    public Point2d(double x, double y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    //Конструктор по умолчанию
    public Point2d() {
        //Вызовите конструктор с двумя параметрами и определите источник
        this(0, 0);
    }

    //Возвращение координаты X
    public double getX() {
        return xCoord;
    }

    //Возвращение координаты Y
    public double getY() {
        return yCoord;
    }

    //Установка значения координаты X
    public void setX(double val) {
        xCoord = val;
    }

    //Установка значения координаты Y
    public void setY(double val) {
        yCoord = val;
    }
}