public interface Staff {
    void helpStudent(Student student);

    default void giveMaterials() {
        System.out.println("https://habr.com/ru/");
    }
}
