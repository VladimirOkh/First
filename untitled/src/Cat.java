public class Cat {
    public void feed() {
        System.out.println("Cat sleeps");
    }
}

class Main {
    public static void main(String[] args) {
        Cat bella = new Cat();
        bella.feed();
    }
}