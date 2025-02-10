package calisanYönetimSistemi;

public class calisan {
    private String name;
    private String surname;
    private int salary;
    private String position;

    public calisan(String name, String surname, int salary, String position) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void calisanBilgileriYazdir(){
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("salary = " + salary);
        System.out.println("position = " + position);
    }
}
