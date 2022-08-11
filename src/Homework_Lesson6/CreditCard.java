package Homework_Lesson6;

import java.util.Random;
import java.util.Scanner;

public class CreditCard {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String cardHolder;
    int accountNumber;
    double runningSum;

    void addInfoAboutCard(){
        accountNumber = random.nextInt(111111,999999);
        System.out.println("Введите имя и фамилию держателя карты: ");
        cardHolder = scanner.nextLine();
        System.out.println("Введите текущую сумму на карте: ");
        runningSum = scanner.nextDouble();
    }
    double addMany(double addMany){
        runningSum+=addMany;
        return runningSum;
    }
    double withdrawMany (double withdrawMany){
        runningSum-=withdrawMany;
        return runningSum;
    }
    void infoAboutCard (){
        System.out.println("Имя держателя карты: "+cardHolder+"; Номер счета: "+accountNumber+"; Текущая сумма на карте: "+runningSum);
    }

}
