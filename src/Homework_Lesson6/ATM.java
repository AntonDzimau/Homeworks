package Homework_Lesson6;

public class ATM {
    private int count20;
    private int count50;
    private int count100;
    private int totalAmount = 0;

    ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    /**
     * НЕВЕРНО СЧИТАЕТ КОЛИЧЕСТВО КУПЮР
     */
    public boolean withdrawCash(int withdrawCash) {
        int issued100 = 0;
        int issued50 = 0;
        int issued20 = 0;
        System.out.println("You want to withdraw a $" + withdrawCash + ". One minute, please.");
        for (; this.totalAmount > 0; ) {
            if (this.totalAmount < withdrawCash) {
                System.out.println("Error. Not enough money. The ATM has a $" + this.totalAmount + ". Choice other amount and try again.");
                break;
            }
            if (withdrawCash >= 100 && count100 >= withdrawCash / 100) {
                count100 -= withdrawCash / 100;
                this.totalAmount = this.totalAmount - (withdrawCash / 100) * 100;
                issued100 += (withdrawCash / 100);
                withdrawCash = withdrawCash - (withdrawCash / 100) * 100;
            } else if (withdrawCash >= 50 && count50 >= withdrawCash / 50) {
                count50 -= withdrawCash / 50;
                this.totalAmount = this.totalAmount - (withdrawCash / 50) * 50;
                issued50 += (withdrawCash / 50);
                withdrawCash = withdrawCash - (withdrawCash / 50) * 50;
            } else if (withdrawCash >= 20 && count20 >= withdrawCash / 20) {
                count20 -= withdrawCash / 20;
                this.totalAmount = this.totalAmount - (withdrawCash / 20) * 20;
                issued20 += (withdrawCash / 20);
                withdrawCash = withdrawCash - (withdrawCash / 20) * 20;
            } else if (withdrawCash > 0) {
                System.out.println("Error. ATM has no banknotes to dispense. Please, contact support.");
                System.out.println("I gave you: " + issued100 + " $100 bills, " + issued50 + " $50 bills and " + issued20 + " $20 bills.");
                break;
            } else if (withdrawCash == 0) {
                System.out.println("Give your money, honey. I gave you: " + issued100 + " $100 bills, " + issued50 + " $50 bills and " + issued20 + " $20 bills.");
                break;
            }
        }
        return true; //я не понимаю, какую роль он играет здесь
    }

    int addCashToATM(int addedBill, int numberOfBanknotes) {
        if (addedBill == 20) {
            totalAmount += 20 * numberOfBanknotes;
            count20 += numberOfBanknotes;
            System.out.println("OK. I accept " + numberOfBanknotes + " banknotes of " + addedBill + " bucks.");
        } else if (addedBill == 50) {
            totalAmount += 50 * numberOfBanknotes;
            count50 += numberOfBanknotes;
            System.out.println("OK. I accept " + numberOfBanknotes + " banknotes of " + addedBill + " bucks.");
        } else if (addedBill == 100) {
            totalAmount += 100 * numberOfBanknotes;
            count100 += numberOfBanknotes;
            System.out.println("OK. I accept " + numberOfBanknotes + " banknotes of " + addedBill + " bucks.");
        } else {
            System.out.println("Insert a 20, 50 or 100 dollars bill.");
        }
        return totalAmount;
    }

    void infoAboutATM() {
        System.out.println("Total amount of money in ATM: $" + totalAmount);
        System.out.println("The number of $100 bills is: " + count100);
        System.out.println("The number of $50 bills is: " + count50);
        System.out.println("The number of $20 bills is: " + count20);
    }

    void infoAboutTotalAmountInATM() {
        System.out.println("Total amount of money in ATM: $" + totalAmount);
    }

}
