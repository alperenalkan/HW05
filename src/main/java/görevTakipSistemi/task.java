package görevTakipSistemi;

import java.util.ArrayList;

public class task {

    ArrayList<person> people; //görevdeki kişileri tutacak
    int[] numbers;  //dizisi (görev süreleri, öncelikler vb. bilgiler için)


    public task(int[] numbers, ArrayList<person> people)  {
        this.numbers = numbers;
        this.people = people;


    }

    public void printTaskDetails(){
        System.out.println("Task Details:");
        System.out.println("the value of the numbers in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nGörevdeki kisiler");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }

    }
    public  int sumNumbers(){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum;
    }
    public int getPeopleSum(){
       return people.size();
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public ArrayList<person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<person> people) {
        this.people = people;
    }
}
