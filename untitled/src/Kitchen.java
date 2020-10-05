public class Kitchen {
    public void cookPasta() {
        System.out.println("Вскипятить воду");
        System.out.println("Положить в воду макароны");
        System.out.println("Подождать");
        System.out.println("Слить воду");
    }

    public static class Main {
        public static void main(String[] args) {
            Kitchen kitchen = new Kitchen();
            System.out.println("Варим макароны:");
            kitchen.cookPasta();
        }
    }
}
