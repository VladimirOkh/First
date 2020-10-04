public class WriteCode extends Task {
    String code;

    public WriteCode(int number, String taskText) {
        super(number, taskText);
        code = "Hello World";
    }

    @Override
    void doTask() {

    }

    @Override
    public String toString() {
        return "WriteCode";
    }
}
