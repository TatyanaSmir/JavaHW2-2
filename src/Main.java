public class Main {
    public static void main(String[] args) {
        int account1 = 10;// на счету абонента до пополнения счета
        int refill = 1000;// сумма пополнения счета

        int bonus = 0;
        if (refill >= 1000) {
            bonus = (account1 + refill) / 100;
        }
        int account2 = account1 + refill + bonus;// на счету абонента после пополнения счета

        System.out.println("Бонусный счет = " + bonus);
        System.out.println("Баланс =" + account2);

    }


}
