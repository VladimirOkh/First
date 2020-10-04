public abstract class Task implements Autochecked{
    int number;
    String taskText;

    public Task(int number, String taskText) {
        this.number = number;
        this.taskText = taskText;
    }

    abstract void doTask();

    @Override
    public String toString() {
        return "Task";
    }
}
