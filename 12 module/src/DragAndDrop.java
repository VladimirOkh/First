public class DragAndDrop extends Task implements Autochecked {
    String[][] variants;

    public DragAndDrop(int number, String taskText) {
        super(number, taskText);
        variants = new String[1][1];
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
        return "DragAndDrop";
    }
}
