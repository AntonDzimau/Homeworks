package Homework_Lesson10;

public class StringModification {
    public void twoFirstDigitalBlocks(String str) {
        System.out.println(str.substring(0, 4) + "-" + str.substring(9, 13));
    }

    public void replacingAWithStar(String str) {
        System.out.println(str.replaceAll("[A,a]", "*"));
    }

    public void replacingAllLettersWithStars(String str) {
        System.out.println(str.replaceAll("[a-zA-Z]", "*"));
    }

    public void letterOutput(String str) {
        System.out.println("letters: " + str.replaceAll("\\W*\\d*", "").toUpperCase());
    }

    public void checkABCCombination(String str) {
        if (str.toUpperCase().indexOf("ABC") != -1) {
            System.out.println("Your string have a 'abc' combination.");
        } else {
            System.out.println("String don't have the combination.");
        }
    }

    public void isStartsWith5555(String str) {
        System.out.println("It's " + str.startsWith("5555"));
    }

    public void isEndsWith1a2b(String str) {
        System.out.println("It's " + str.endsWith("1a2b"));
    }

    public void returnInReverseOrder(String str) {
        char[] charsOfDoc = str.toCharArray();
        for (int i = charsOfDoc.length - 1; i >= 0; i--) {
            System.out.print(charsOfDoc[i]);
        }
        System.out.println();
    }
}
