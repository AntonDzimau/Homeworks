package Homework_Lesson6;

public class CreditCard {
    String cardHolder;
    int accountNumber;
    int runningSum;
    public CreditCard(int accountNumber, int runningSum){
        this.accountNumber = accountNumber;
        this.runningSum = runningSum;
    }
    int addMany(int addMany){
        runningSum+=addMany;
        return runningSum;
    }
    int removeMany (int removeMany){
        runningSum-=removeMany;
        return runningSum;
    }
    void infoAboutCard (){
        System.out.println("Имя держателя карты: "+cardHolder);
        System.out.println("Номер счета: "+accountNumber);
        System.out.println("Текущая сумма на карте: "+runningSum);

    }

}
