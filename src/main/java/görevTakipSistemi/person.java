package görevTakipSistemi;

import java.util.ArrayList;

public class person {

    public String name;
    public int age;
    public String position;


    public person(String name, int age,String position) {
        this.name = name;
        this.age = age;
        this.position = position;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void personPosition() {
        System.out.println("name: "+name+"\n"+"age: "+age+"\n"+ "position: " + position);
    }
}
