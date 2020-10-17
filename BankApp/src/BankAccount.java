public class BankAccount {
    int balance;
    int previousTransaction;
    String customerID;
    String customerName;

    public void deposit(int amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }
    public void withdraw(int amount){
        if (amount != 0){
            balance -=amount;
            previousTransaction = -amount;
        }
    }
    public void getPreviousTransaction(){
        if (previousTransaction > 0){
            System.out.println("Зачислено: " + previousTransaction);
        }else if (previousTransaction < 0){
            System.out.println("Снято: "+ Math.abs(previousTransaction));
        }else System.out.println("Предыдущие транзакции отсутствуют");
    }
    public void showMenu(){

    }
}
