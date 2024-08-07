import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> l1;

    public TaskManager() {
        l1 = new ArrayList<>();
    }

    public void addTask(Task task) {
        l1.add(task);
        System.out.println("Task Added Successfully!");
    }

    public void displayDetails() {
        System.out.println("The details of the tasks are:");
        // for (Task task : tasks) {
        //     System.out.println(task); // Calls the toString() method of Task
        // }
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }

    public void displayStatus(int taskId) {
        boolean taskFound = false;

        for (Task task : l1) {
            if (task.getTaskId() == taskId) {
                taskFound = true;
                if (task.getStatus().equalsIgnoreCase("Pending")) {
                    task.setStatus("Completed");
                    System.out.println("Kudos! Task marked as completed.");
                } else if (task.getStatus().equalsIgnoreCase("Completed")) {
                    System.out.println("Task is already completed.");
                }
                return; // Exit method after updating task
            }
        }

        if (!taskFound) {
            System.out.println("Task not found or Invalid ID.");
        }
    }
}
