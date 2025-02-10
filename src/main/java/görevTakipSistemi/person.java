package görevTakipSistemi;

import java.util.ArrayList;

public class person {

    public String name;
    public int age;


    public person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // Kişinin bilgilerini yazdıran toString metodu
    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }



}
