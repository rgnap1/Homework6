public class Main {
    public static void main(String[] args) {
        System.out.println("Homework6.1 ");
        System.out.println("task1 ");
        //task1
        for(int i = 1; i < 11; i++){
            System.out.println("Итерация цикла " + i );
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("task2 ");
        //task2
        for (int i = 10; i > 0; i--){
            System.out.println("Итерация цикла " + i);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("task3 ");
        //task3
        for (int i = 0 ; i < 18; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("task4 ");
        //task4
        for (int i = 10; i > -11; i--){
            System.out.println("Итерация цикла " + i);
        }
        System.out.println(" ");
        System.out.println("Homework6.2 ");
        System.out.println("task1 ");
        //task1
        for(int i = 1904; i < 2097; i = i+4){
            System.out.println(i + " год является високосным");
        }
        System.out.println(" ");
        System.out.println("task2 ");
        //task2
        for(int i = 7; i < 99; i = i+7){
            System.out.println("Итерация цикла " + i);
        }
        System.out.println(" ");
        System.out.println("task3 ");
        //task3
        for(int i = 1; i < 513; i = i*2){
            System.out.println("Итерация цикла " + i);
        }
        System.out.println(" ");
        System.out.println("Homework6.3 ");
        System.out.println("task1 ");
        //task1
        int moneyboxInMounth = 29000;
        int totalMoney = 0;
        for (int i = 1; i < 13; i++){
            totalMoney = moneyboxInMounth*12;
            System.out.println("Месяц " + i + " сумма накоплений равна " + moneyboxInMounth + " рублей");
        } System.out.println("За год накопилось вего " + totalMoney + " рублей" );

        System.out.println(" ");
        System.out.println("task2 ");
        //task2
        int moneyboxInMounth1 = 29000;
        int totalMoney1;
        int totalMoney2 = 0;
        for (int i = 1; i < 13; i++){
            totalMoney1 = moneyboxInMounth1/100;
            totalMoney1 = totalMoney1+moneyboxInMounth1;
            totalMoney2 = totalMoney1*12;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalMoney1 + " рублей");
        } System.out.println("За год накоплений под 12% годовых скопилось вего " + totalMoney2 + " рублей" );














    }
}