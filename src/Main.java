public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int deposit = 15_000;
        int accumulation = 0;
        int i = 0;
        while (accumulation <= 2_459_000) {
            accumulation = accumulation + deposit;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + accumulation + " рублей.");
            i++;
        }

        System.out.println("Задание 2");
        int numbers = 1;
        while (numbers <= 10) {
            System.out.print(numbers + " ");
            numbers++;
        }
        System.out.print("\n");
        for (int numbers2 = 10; numbers2 >= 1; numbers2--) {
            System.out.print(numbers2 + " ");
        }

        System.out.print("\nЗадание 3\n");

        int population = 12_000_000;
        int fertilityToThousand = 17;
        int mortalityToThousand = 8;
        int realFertilityToThousand = fertilityToThousand - mortalityToThousand;
        int realFertilityTo12Million = population / 1000 * realFertilityToThousand;
        int totalFertilityIncreaseToYear = 0;
        for (int year = 1; year <= 10; year++) {
            totalFertilityIncreaseToYear = totalFertilityIncreaseToYear + realFertilityTo12Million;
            System.out.println("Год " + year + " численность населения сотавляет " + (totalFertilityIncreaseToYear + population) + " человек.");
        }

        System.out.println("Задание 4");

        int contribution = 15_000;
        int stockpiling = 0;
        int month = 1;
        for (; stockpiling < 12_000_000; month++) {
            stockpiling = stockpiling + contribution / 100 * 7;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + (stockpiling + contribution) + " рублей.");
        }


        System.out.println("Задание 5");

        int contriBution = 15_000;
        int stockPiling = 0;
        int montH = 0;
        for (; stockPiling < 12_000_000; montH++) {
            stockPiling = stockPiling + contriBution / 100 * 7;
            if (montH % 6 == 0) {
                System.out.println("Месяц " + montH + " ,сумма накоплений равна " + (stockPiling + contriBution) + " рублей.");
            }
        }
        System.out.println("Задание 6");

        int investment = 15_000;
        int savings = 0;
        int moon = 1;
        for (;moon<=108; moon++) {
            savings = savings + investment / 100 * 7;
            if (moon % 6 == 0) {
                System.out.println("Месяц " + moon + " ,сумма накоплений равна " + (savings + investment) + " рублей.");}
        }

        System.out.println("Задание 7");
        int friday=1;
        for(int date=0;date<=31;date++){
            if (date%7==friday){
                System.out.println("Сегодня пятница "+date+"-е число.Необходимо подготовить отчет.");}
            }
        System.out.println("Задание 8");
        int period=79;
        int currentYear=2023;
        int startYear=currentYear -200;
        int endYear=currentYear + 100;
        for(int year=startYear;year<=endYear;year++){
            if(year%period==0){
                System.out.println(year);}
            }
        }
    }

