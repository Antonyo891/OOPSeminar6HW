package SRP;
// каждый класс должен иметь только одну ответственность, которая должна быть инкапсулирована в этом классе.
// данный класс создает сотрудника...для нахождения его зарплаты должен быть создан новый класс
public class Employee {
    private String name;
    private String dol;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDol() {
        return dol;
    }

    public void setDol(String dol) {
        this.dol = dol;
    }

    public Employee(String name, String dol) {
        this.name = name;
        this.dol = dol;
    }
}
