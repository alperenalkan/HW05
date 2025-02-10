package görevTakipSistemi;

import java.util.ArrayList;

public class taskManager {
    public ArrayList<task> tasks;

    public taskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(task t) {
        tasks.add(t);

    }

    public void printAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Görev listesi boş.");
        } else {
            System.out.println("Tüm Görevler:");
            for (task t : tasks) {
                t.printTaskDetails();
                System.out.println();
            }

        }


    }
    public int getTastCount() {
        return tasks.size();
    }

    public int getTotalTaskDuration(){
        int totalDuration = 0;
        for (task t : tasks) {
            totalDuration += t.sumNumbers();
        }
        return totalDuration;
    }
    public int getTotalPeopleCount() {
        int totalPeople = 0;
        for (task t : tasks) {
            totalPeople += t.getPeopleSum();
        }
        return totalPeople;
    }

    public task getTask(int index){
        if (index < 0 || index >= tasks.size()) {
            return tasks.get(index);
        }else {
            System.out.println("gecersiz görev index i.");
            return null;
        }
    }
}
