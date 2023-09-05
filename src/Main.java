public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

    for (int i=1;i<=10;i++){
    System.out.println(i);}

         System.out.println("Задание 2");

    for (int i=10;i>0;i--){
    System.out.println(i);}

         System.out.println("Задание 3");

    for (int i=0;i<=17;i=i+2){
    System.out.println(i);}

         System.out.println("Задание 4");
    for (int i=10;i>=-10;i--){
    System.out.println(i);}

        System.out.println("Задание 5");

    for (int i=1904;i<=2096;i=i+4){
    System.out.println(i+" год является високосным");}

        System.out.println("Задание 6");

    for (int i=7;i<=98;i=i+7){
    System.out.println(i);}

        System.out.println("Задание 7");

    for (int i=1;i<=512;i=i*2){
    System.out.println(i);}

        System.out.println("Задание 8");

    int moneyDeposit=29_000;
    int totalMoneyAccumulation=0;
    for (int i=1;i<=12;i++){
        totalMoneyAccumulation=totalMoneyAccumulation+moneyDeposit;
    System.out.println("Месяц "+i+" сумма накоплений равна "+totalMoneyAccumulation+" рублей.");}

    System.out.println("Задание 9");

    int deposit = 29_000;
    int accumulation = 0;
    for (int i = 1; i <= 12; i++) {
        accumulation = accumulation + accumulation/100;
        accumulation = accumulation + deposit;
        System.out.println("Месяц " + i + " ,сумма накоплений равна " + accumulation+" рублей.");}

        System.out.println("Задание 10");

    int n=2;
    for (int i = 1; i <= 10; i++){
        System.out.println(n+"*"+i+"="+n*i);}

 }
}