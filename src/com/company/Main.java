package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int typeOfRest;
        //test
        Scanner in =  new Scanner(System.in);
        System.out.println("Введите желаемый тип отдыха:\n" +
                "1 — “пляжный отдых”;\n" +
                "2 — “активный отдых”;\n" +
                "3 — “семейный отдых”.");
        typeOfRest = in.nextInt();
        if (typeOfRest == 1) {
            System.out.println("Предлагаем тур в Таиланд для замечательного пляжного отдыха!");
        } else if (typeOfRest == 2) {
            System.out.println("Предлагаем тур в Австрию  для замечательного пляжного отдыха!");
        }
        else if (typeOfRest == 3) {
            System.out.println("Предлагаем тур в Турцию для замечательного пляжного отдыха!");
        }
        int sumOfPay;
        System.out.println("Введите планируемую сумму и мы расчитаем вам скидку:");
        sumOfPay = in.nextInt();
        if(sumOfPay > 500) {
            if (sumOfPay > 1000) {
                System.out.println("Ваша скидка: 5%");
            }
            else {
                System.out.println("Ваша скидка: 3%");
            }
        }
        else {
            System.out.println("К сожалению, у вас не будет скидки :(");
        }
        //вызовем метод main1()
        main1();

    }
    public static void main1() {
        System.out.println("Вывод нечетные числа от 1 до 99");
        int i;
        for (i = 1; i < 99; i+=2) {
            System.out.println(i);
        }
        System.out.println("Вывод степеней двойки до 1000");
        for (i = 1; i < 1000; i*=2) {
            System.out.println(i);
        }
    }
}
