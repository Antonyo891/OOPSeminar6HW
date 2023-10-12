package DIP;
/*Принцип инверсии зависимостей.
Для того чтобы модуль высокого уровня (Car)
не зависел от модуля низкого уровня(дизельный или бензиновый двигатель)
создан интерфейс (можно было абстрактный класс) Engine от которого зависет модуль*/
    public class Car {
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}
