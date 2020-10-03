public class Test extends Task implements Autochecked{
    @Override
    void doTask() {


    }

    @Override
    public boolean checkAutomatically() {
        return false;
    }

    @Override
    public String toString() {
        return "Test{}";
    }
}
