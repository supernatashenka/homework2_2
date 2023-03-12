public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int charge = 1050;
        int bonus;

        if (charge > 1000) {
            bonus = charge / 100;
        } else {
            bonus = 0;

        }

        int finalRAte = amount + charge + bonus;

        System.out.println("Ваш счет: " + finalRAte + " Начислено бонусов: " + bonus);
    }
}