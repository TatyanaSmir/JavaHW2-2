public class Main {
    public static void main(String[] args) {
        int x = 10;// на счету абонента
        int y = 1000;// сумма пополнения счета

        int bonus = 0;
        if (y >= 1000) {
            bonus = (x + y) / 100;
        }
        int z = x + y + bonus;

        System.out.println("Бонусный счет = " + bonus);
        System.out.println("Баланс =" + z);

    }


}
