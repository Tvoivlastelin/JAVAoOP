package HWsem6_oop.work1;

// Прямоугольник
public class Rectangle {

    private int height;
    private int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int area(){
        return this.width*this.height;
    }
}
