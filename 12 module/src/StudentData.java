public class StudentData {
    public static int taskCountForAll;
    public static int taskCount;
    public static final int MAX_MODULE_COUNT = 20;

    public void solveTask() {
        System.out.println("Задание решено!");
        taskCount++;
        taskCountForAll++;
    }

}
