package ISP;
/*разделение «толстого» интерфейса (содержащего методы которые могут реализовать не все модули-фигуры)
на несколько специализированных (для плоских фигур и для 3Д фигур)*/
public interface Shape {
    public double area();

}
