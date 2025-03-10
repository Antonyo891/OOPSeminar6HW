package LSP;
//порожденный класс не изменяет определение типа родительского и его поведение: 
//метод area находит площадь и в родительском и в порожденном классе 
public class Rectangle extends QuadRangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.height * this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
