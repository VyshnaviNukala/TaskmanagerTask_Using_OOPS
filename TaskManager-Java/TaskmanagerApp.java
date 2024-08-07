import java.util.Scanner;

public class TaskmanagerApp {

    public static void main(String[] args) {
        System.out.println("WELCOME!");
        int taskidcount = 1;

        TaskManager tm = new TaskManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1) Add Task");
            System.out.println("2) Details of the Task");
            System.out.println("3) Status of the Task");
            System.out.println("4) Exit from the Task");
            System.out.print("Enter your choice: ");
        
            int choice = sc.nextInt();
           
            sc.nextLine(); // Consume the newline character
         
            switch (choice) {
                case 1:
                    System.out.print("Enter the Task Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter the due date of the Task (YYYY-MM-DD): ");
                    String duedate = sc.nextLine();

                    System.out.print("Enter the priority of the Task (High/Medium/Low): ");
                    String priority = sc.nextLine();

                    Task t = new Task(taskidcount++, name, duedate, priority);
                    tm.addTask(t);
                
                    break;

                case 2:
                    System.out.println("The details of the tasks are:");
                    tm.displayDetails();
                    break;

                case 3:
                    System.out.print("Enter the ID of the task to mark as COMPLETED: ");
                    int taskId = sc.nextInt();
                    sc.nextLine(); // Consume the newline character
                    tm.displayStatus(taskId);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0); // Terminates the program

                default:
                    System.out.println("Invalid choice! Please choose between 1 - 4.");
            }
            System.out.println(); // Blank line for better readability
        }
    }
}

