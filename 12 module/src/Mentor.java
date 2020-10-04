import java.util.Random;

public class Mentor extends Person implements Staff{
    private boolean mood;
    final Random random = new Random();

    public Mentor(String name, String surname, int age) {
        super(name, surname, age);
        mood = true;
    }

    public boolean taskCheck(Task task){
        int moodRandom = random.nextInt(2000);
        mood = moodRandom > 1000;
        if (mood){
            System.out.println("Ментор принял задачу " + task);
            return true;
        }else{
            System.out.println("Задача " + task + " не принята");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Mentor";
    }

    @Override
    public void helpStudent(Student student) {
        System.out.println("Продолжай в том же духе, "+ student.getName());
    }

    @Override
    public void giveMaterials() {

    }
}
