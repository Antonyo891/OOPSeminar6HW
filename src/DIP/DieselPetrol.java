package DIP;
// детали должны зависеть от абстракций(в данном случае от интерфейса)
public class DieselPetrol implements Engine {
    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}
