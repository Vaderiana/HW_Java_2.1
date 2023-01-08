public class Main {
    public static void main(String[] args) {
        int account = 100;
        int recharge = 2200;
        int bonusTotal = recharge > 1000 ? recharge / 100 : 0;
        int summTotal = account + recharge + bonusTotal;

        System.out.println("Сумма бонуса составляет " + bonusTotal);
        System.out.println("Итоговая сумма на счету " + summTotal);

        }
    }
