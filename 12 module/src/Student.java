import java.util.Objects;
import java.util.Random;

public class Student extends Person {
    private int age;
    private String name;
    private String secondName;
    private String learningObjective;
    private boolean experience;
    public int groupNum;
    public static int tasksCount;
    public static int solvedTasks;
    public int solvedModulesCount;
    public static int AllSolvedTasks;
    public static final int MAX_MODULE_COUNT = 20;
    public static boolean isAllTasksSolved = false;
    private static Mentor mentor;
    private static int i = 0;
    Discipline myDiscipline = Discipline.JAVA;


    public static void main(String[] args) {
        Task[] allTasks = new Task[40];
        int n = 0;
        for (Task task : allTasks) {
            final Random random = new Random();
            int min = 1;
            int max = 3;
            int diff = max - min;
            int cases = random.nextInt(diff + 1);
            cases += min;
            if (cases == 1) {
                allTasks[n] = new Test(n, "Test");
                n++;
            } else if (cases == 2) {
                allTasks[n] = new DragAndDrop(n, "DragAndDrop");
                n++;
            } else if (cases == 3) {
                allTasks[n] = new WriteCode(n, "WriteCode");
                n++;
            }
        }
        final Random random = new Random();
        int min = 1;
        int max = 40;
        int diff = max - min;
        int tasksCount = random.nextInt(diff + 1);
        Mentor mentor1 = new Mentor("МенторИмя1", "МенторФамилия1", 25);
        Mentor mentor2 = new Mentor("МенторИмя2", "МенторФамилия2", 25);
        Student[] studs = new Student[]{
                new Student(20, "СтудентИмя1", "СтудентФамилия1", "Цель",
                        false, 4, tasksCount, mentor1, 0),
                new Student(20, "СтудентИмя2", "СтудентФамилия2", "Цель",
                        false, 4, tasksCount, mentor2, 0),
                new Student(20, "СтудентИмя3", "СтудентФамилия3", "Цель",
                        false, 4, tasksCount, mentor1, 0),
                new Student(20, "СтудентИмя4", "СтудентФамилия4", "Цель",
                        false, 4, tasksCount, mentor2, 0),
                new Student(20, "СтудентИмя5", "СтудентФамилия5", "Цель",
                        false, 4, tasksCount, mentor1, 0)
        };
        for (int i = 0; i < studs.length; i++) {
            studs[i].setTasksCount(tasksCount);
            SolveTasks(tasksCount, allTasks);
            isAllTasksSolved = false;
        }
    }


    public Student(String secondName, String name, int age) {
        this(18, "Владимир", "Охременко", "Устроиться на работу", false,
                0, 0, mentor, 0);
        this.secondName = "Охременко";
        this.name = "Владимир";
        this.age = 18;
    }

    public Student(int age, String name, String secondName, String learningObjective, boolean experience,
                   int groupNum, int tasksCount, Mentor mentor, int solvedTasksCount) {
        super(secondName, name, age);
        this.learningObjective = learningObjective;
        this.experience = experience;
        this.groupNum = groupNum;
        Student.tasksCount = tasksCount;
        Student.mentor = mentor;
        Student.solvedTasks = solvedTasksCount;
    }


    public static void SolveTasks(int tasksCount, Task[] tasks) {
        while (!isAllTasksSolved) {
            SolveTask(tasks[i]);
            if (getSolvedTasks() == tasksCount) {
                System.out.println("Студент "+ i +" решил все задачи");
                Student.setSolvedTasks(0);
                i++;
                isAllTasksSolved = true;
            } else {
                System.out.println(Student.getSolvedTasks() + " " + tasksCount);
                System.out.println("Не все задания решены");
                isAllTasksSolved = false;
            }
        }
    }

    private static void SolveTask(Task task) {
        if (task instanceof DragAndDrop || task instanceof Test) {
            System.out.println("Задание выполнено");
            setSolvedTasks(getSolvedTasks() + 1);
            Student.setAllSolvedTasks(Student.getAllSolvedTasks() + 1);
        } else if (Student.mentor.taskCheck(task)) {
            setSolvedTasks(getSolvedTasks() + 1);
            Student.setAllSolvedTasks(Student.getAllSolvedTasks() + 1);
        } else {
            Student.mentor.taskCheck(task);
        }
    }

    public static int getSolvedTasks() {
        return solvedTasks;
    }

    public static void setSolvedTasks(int solvedTasks) {
        Student.solvedTasks = solvedTasks;
    }

    public static int getAllSolvedTasks() {
        return AllSolvedTasks;
    }

    public static void setAllSolvedTasks(int allSolvedTasks) {
        AllSolvedTasks = allSolvedTasks;
    }

    public static int getMaxModuleCount() {
        return MAX_MODULE_COUNT;
    }

    public static boolean isIsAllTasksSolved() {
        return isAllTasksSolved;
    }

    public static void setIsAllTasksSolved(boolean isAllTasksSolved) {
        Student.isAllTasksSolved = isAllTasksSolved;
    }

    public static Mentor getMentor() {
        return mentor;
    }

    public static void setMentor(Mentor mentor) {
        Student.mentor = mentor;
    }

    public void passModule() {
        if (solvedModulesCount < MAX_MODULE_COUNT) {
            solvedModulesCount++;
            System.out.println("Модуль пройден");
        } else {
            System.out.println("Все модули пройдены!");
        }
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

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSolvedModulesCount() {
        return solvedModulesCount;
    }

    public void setSolvedModulesCount(int solvedModulesCount) {
        this.solvedModulesCount = solvedModulesCount;
    }

    public int getTasksCount() {
        return solvedModulesCount;
    }

    public void setTasksCount(int tasksCount) {
        this.solvedModulesCount = tasksCount;
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
                ", countOfModules=" + solvedModulesCount +
                ", tasksCount=" + solvedModulesCount +
                '}';
    }
}
