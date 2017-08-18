import java.util.ArrayList;

/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{

    private ArrayList<TodoItem> listToDo;

    public TodoList() {
        this.listToDo = new ArrayList<TodoItem>();
    }

    public ArrayList<TodoItem> getListToDo() {
        return this.listToDo;
    }

    public void setListToDo(ArrayList<TodoItem> listToDo) {
        this.listToDo = listToDo;
    }

    public void addTaskToList(TodoItem task) {
        listToDo.add(task);
    }

    public void displayTasksList() {
        Integer count = 1;

        for (TodoItem task : listToDo) {

            System.out.println(String.format("%d. %s", count, task.createPrintableTaskToDo()));
            count += 1;
        }
    }

    public void markTask(int taskToMarkNumber) {
        taskToMarkNumber -= 1;
        for (int i = 0; i < listToDo.size(); i++) {
            if (taskToMarkNumber == (i)) {

                if (!listToDo.get(i).getTaskDoneStatus()) {
                    listToDo.get(i).setTaskDoneStatus(true);

                } else {

                    listToDo.get(i).setTaskDoneStatus(false);
                }
            }
        }
    }

    public void removeTask(int taskToRemoveNumber) {
        ArrayList<TodoItem> temp = new ArrayList<TodoItem>();
        taskToRemoveNumber -= 1;
        for (int i = 0; i < listToDo.size(); i++) {

            if (taskToRemoveNumber == (i)) {

                continue;

                } else {

                    temp.add(listToDo.get(i));
                }
        }

        this.listToDo = temp;
    }

    public void archiveTasks() {

        for (int i = 0; i < listToDo.size(); i++) {

            if (listToDo.get(i).getTaskDoneStatus() == true) {

                listToDo.remove(i);
            }
        }
    }

}
