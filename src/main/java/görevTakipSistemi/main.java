package görevTakipSistemi;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        person person1 = new person("alp",28);
        person person2 = new person("Ayşe", 30);
        person person3 = new person("Mehmet", 22);

        ArrayList<person> peopleForTask1 = new ArrayList<>();
        peopleForTask1.add(person1);
        peopleForTask1.add(person2);

        ArrayList<person> peopleForTask2 = new ArrayList<>();
        peopleForTask2.add(person2);
        peopleForTask2.add(person3);

        // Sayıları (görev süreleri veya öncelikler) belirliyoruz
        int[] task1Numbers = {10, 20, 30};  // Görev 1'in süreleri
        int[] task2Numbers = {15, 25};      // Görev 2'nin süreleri

        // Task nesnelerini oluşturuyoruz
        task task1 = new task(task1Numbers, peopleForTask1);
        task task2 = new task(task2Numbers, peopleForTask2);

        // TaskManager nesnesi oluşturuyoruz
        taskManager taskManager = new taskManager();

        // Görevleri TaskManager'a ekliyoruz
        taskManager.addTask(task1);
        taskManager.addTask(task2);

        // Tüm görevleri yazdırıyoruz
        taskManager.printAllTasks();

        // Görev sayısını yazdırıyoruz
        System.out.println("Toplam görev sayısı: " + taskManager.getTastCount());

        // Görevlerin toplam süresini yazdırıyoruz
        System.out.println("Toplam görev süresi: " + taskManager.getTotalTaskDuration() + " dakika");

        // Görevdeki toplam kişi sayısını yazdırıyoruz
        System.out.println("Toplam kişi sayısı: " + taskManager.getTotalPeopleCount());
    }
}

