package OCP;
//классы должны быть открыты для расширения и одновременно закрыты для модификации.
// если бы в методе calculateAllowedSpeed() реализовывался алгоритм нахождения скорости для определенных транспортных средств
// то при необходимости работы с новым транспортным средством нужно было бы модифицировать класс
// при добавлении новых видов транспортного средства не придется модифицировать класс Vehicle для возможности использовать calculateAllowedSpeed()
// достаточно расширить иерархию добавив новый класс нового транспортного средства переопредеяющий calculateAllowedSpeed()
public class Vehicle {
    private int maxSpeed;
    private String type;

    public double calculateAllowedSpeed(){
        return maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }


}
