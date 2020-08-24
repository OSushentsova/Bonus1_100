public class Main {
    public static void main(String[] args) {
        double initalBalance = 567.69;
        double payment = 350.00;
        double newBalance;
        int bonus;
        if (payment >= 100.00) {
           bonus = (int) (payment / 100);
        } else {
            bonus = 0;
        }
        newBalance = initalBalance + payment + bonus;
        System.out.println(bonus);
        System.out.println(newBalance);
    }
}
