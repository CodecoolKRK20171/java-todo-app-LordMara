/**
 * Class representing a single todo item.
 * 
 */
public class TodoItem{

    private String taskToDo;
    private boolean taskDoneStatus;

    public TodoItem(String taskToDo) {
        this.taskToDo = taskToDo;
        this.taskDoneStatus = false;
    }

    public String getTaskToDo() {
        return this.taskToDo;
    }

    public void setTaskToDo(String taskToDo) {
        this.taskToDo = taskToDo;
    }

    public boolean getTaskDoneStatus() {
        return this.taskDoneStatus;
    }

    public void setTaskDoneStatus(boolean taskDoneStatus) {
        this.taskDoneStatus = taskDoneStatus;
    }

    public String createPrintableTaskToDo() {
        String taskWithStatus = new String();

        if (taskDoneStatus == false) {
            taskWithStatus = String.format("[ ].%s", taskToDo);

        } else if (taskDoneStatus == true) {
            taskWithStatus = String.format("[X].%s", taskToDo);
        }

        return taskWithStatus;
    }
}
