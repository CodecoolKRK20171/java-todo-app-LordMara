import java.util.Scanner;

/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);;
    String command;

    String endPorgram;
    TodoList taskList = new TodoList();
    Integer taskToChange = null;

    do {
      System.out.println("Please specify a command [list, add, mark, remove, archive]: ");
      command = in.nextLine();
  
      if (command.toLowerCase().equals("list")) {
        taskList.displayTasksList();

      } else if (command.toLowerCase().equals("add")) {
  
        taskList = addTaskToList(taskList, in);

      }  else if (command.toLowerCase().equals("mark")) {
  
        taskList = markTaskToList(taskList, in, taskToChange);
  
      } else if (command.toLowerCase().equals("remove")) {
  
        taskList = removeTaskToList(taskList, in, taskToChange);

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

  private static TodoList addTaskToList(TodoList taskList, Scanner in) {
    String taskToDo;
    System.out.println("Add an item: ");
    taskToDo = in.nextLine();

    TodoItem newTask = new TodoItem(taskToDo);
    taskList.addTaskToList(newTask);
    System.out.println("Item added.");
    return taskList;
  }

  private static TodoList markTaskToList(TodoList taskList, Scanner in, Integer taskToChange) {
    System.out.println("Which one task you want to mark as completed: ");
    taskToChange = in.nextInt();

    taskList.markTask(taskToChange);
    return taskList;

  }

  private static TodoList removeTaskToList(TodoList taskList, Scanner in, Integer taskToChange) {
    System.out.println("Which one task you want to remove: ");
    taskToChange = in.nextInt();
    taskList.removeTask(taskToChange);
    return taskList;

  }

}
