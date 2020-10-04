public class Test extends Task implements Autochecked {
    String[] answers;

    public Test(int number, String taskText) {
        super(number = 0, taskText = "Почини принтер");
        answers = new String[]{"a", "b", "c"};
    }

    @Override
    void doTask() {


    }

    @Override
    public void checkAutomatically() {
        System.out.println("Задание выполнено");
    }

    @Override
    public String toString() {
        return "Test";
    }
}
