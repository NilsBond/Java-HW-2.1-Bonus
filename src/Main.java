public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 1200;
        int bonus = deposit/100;
        if (deposit <= 1000) {
            bonus = 0;
        }
        int new_balance = balance + deposit + bonus;

        System.out.println("Текущий баланс: " + new_balance);
        System.out.println("Итоговый бонус: " + bonus);
    }
}
