import java.util.Objects;

public class Student extends Person {
    private int age;
    private String name;
    private String secondName;
    private String learningObjective;
    private boolean experience;
    private String groupNum;
    private int countOfModules;
    private int tasksCount;
    public static final int MAX_MODULE_COUNT = 20;
    Discipline me = Discipline.JAVA;

    public void passModule() {
        if (countOfModules < MAX_MODULE_COUNT) {
            countOfModules++;
            System.out.println("Модуль пройден");
        } else {
            System.out.println("Все модули пройдены!");
        }
    }

    public Student(String secondName, String name, int age){
        this(18,"Владимир", "Охременко","Устроиться на работу",false,"0",0,0);
        this.secondName = "Охременко";
        this.name = "Владимир";
        this.age = 18;
    }

    public Student(int age, String name, String secondName, String learningObjective, boolean experience, String groupNum, int countOfModules, int countOfTasks) {
        super(secondName,name,age);
        this.learningObjective = learningObjective;
        this.experience = experience;
        this.groupNum = groupNum;
        this.countOfModules = countOfModules;
        this.tasksCount = countOfTasks;
    }


    public void finishTheModule(){

    }

    public void askQuestion(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLearningObjective() {
        return learningObjective;
    }

    public void setLearningObjective(String learningObjective) {
        this.learningObjective = learningObjective;
    }

    public boolean isExperience() {
        return experience;
    }

    public void setExperience(boolean experience) {
        this.experience = experience;
    }

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCountOfModules() {
        return countOfModules;
    }

    public void setCountOfModules(int countOfModules) {
        this.countOfModules = countOfModules;
    }

    public int getTasksCount() {
        return tasksCount;
    }

    public void setTasksCount(int tasksCount) {
        this.tasksCount = tasksCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                experience == student.experience &&
                Objects.equals(name, student.name) &&
                Objects.equals(secondName, student.secondName) &&
                Objects.equals(groupNum, student.groupNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, secondName, experience, groupNum);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", learningObjective='" + learningObjective + '\'' +
                ", experience=" + experience +
                ", groupNum='" + groupNum + '\'' +
                ", countOfModules=" + countOfModules +
                ", tasksCount=" + tasksCount +
                '}';
    }
}
