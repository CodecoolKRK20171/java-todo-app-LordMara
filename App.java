import java.util.Scanner;

/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);;
    String command;
    String taskToDo;
    String endPorgram;
    TodoList taskList = new TodoList();
    Integer taskToChange;

    do {
      System.out.println("Please specify a command [list, add, mark, remove, archive]: ");
      command = in.nextLine();
  
      if (command.toLowerCase().equals("list")) {
        taskList.displayTasksList();

      } else if (command.toLowerCase().equals("add")) {
  
        System.out.println("Add an item: ");
        taskToDo = in.nextLine();
  
        TodoItem newTask = new TodoItem(taskToDo);
        taskList.addTaskToList(newTask);
        System.out.println("Item added.");

      }  else if (command.toLowerCase().equals("mark")) {
  
        System.out.println("Which one task you want to mark as completed: ");
        taskToChange = in.nextInt();
  
        taskList.markTask(taskToChange);
  
      } else if (command.toLowerCase().equals("remove")) {
  
        System.out.println("Which one task you want to remove: ");
        taskToChange = in.nextInt();
        taskList.removeTask(taskToChange);

      } else if (command.toLowerCase().equals("archive")) {
        taskList.archiveTasks();

      } else {
        System.out.println("Wrong command");

      }

      System.out.println("Do you want to end YES/NO");
      endPorgram = in.nextLine();

    } while (!endPorgram.toLowerCase().equals("yes"));

    in.close();
  }

}
