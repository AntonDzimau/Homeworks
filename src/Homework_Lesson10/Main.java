package Homework_Lesson10;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document("5578-kJe-0809-taJ-9I2b");
        //1.1 Вывести на экран в одну строку два первых блока по 4 цифры.
        doc.twoFirstDigitalBlocks(doc.numberOfDocument);
        //1.2 Вывести на экран номер документа, но буквы “a” заменить на * (каждая буква заменятся на *).
        doc.replacingAWithStar(doc.numberOfDocument);
        doc.replacingAllLettersWithStars(doc.numberOfDocument);
        //1.3 Вывести на экран буквы из номера документа в формате "Letters:yyyyyyyy" в верхнем регистре
        doc.letterOutput(doc.numberOfDocument);
        //1.4 Проверить содержит ли в номере документа последовательность abc и вывести сообщение содержит или нет,
        //причем abc и ABC считается одинаковой последовательностью.
        doc.checkABCCombination(doc.numberOfDocument);
        //1.5 Проверить начинается ли номер документа с последовательности 5555.
        doc.isStartsWith5555(doc.numberOfDocument);
        //1.6 Проверить заканчивается ли номер документа на последовательность 1a2b.
        doc.isEndsWith1a2b(doc.numberOfDocument);
        //1.7 Вернуть номер документа в обратном виде(строку наоборот).
        doc.returnInReverseOrder(doc.numberOfDocument);

        /** Дополнительные задания */
        //1. Дана строка произвольной длины с произвольными словами. Найти самое короткое слово в строке и вывести
        // его на экран. Найти самое длинное слово в строке и вывести его на экран. Если таких слов несколько, то
        // вывести последнее из них.
        String randomString = "I'm a random string and you have to check me.";
        System.out.println(randomString);
        String[] charsOfRandomString = randomString.split(" ");
        String minWord = charsOfRandomString[0];
        String maxWord = charsOfRandomString[0];
        for (int i = 0; i < charsOfRandomString.length; i++) {
            if (minWord.length() >= charsOfRandomString[i].length()) {
                minWord = charsOfRandomString[i];
            }
            if (maxWord.length() <= charsOfRandomString[i].length()) {
                maxWord = charsOfRandomString[i];
            }
        }
        System.out.println("The last minimal word is " + "'" + minWord + "'");
        System.out.println("The last maximum word is " + "'" + maxWord + "'");
        //2. Дана строка с произвольным словом. Написать программу для проверки является ли это слово палиндромом.
        String randomWord = "Кок";
        boolean flag = true;
        char[] charsOfRandomWord = randomWord.toUpperCase().toCharArray();
        for (int i = 0; i < charsOfRandomWord.length / 2; i++) {
            if (charsOfRandomWord[i] != charsOfRandomWord[charsOfRandomWord.length - i - 1]) {
                flag = false;
            }
        }
        System.out.println("Is it palindrome? It's " + flag);
        //3. Дана произвольная строка. Вывести на консоль новую строку, которой задублирована каждая буква из
        // начальной строки. Например, "Hello" -> "HHeelllloo".
        //Первый способ
        String braveNewWord = "Aldous";
        String[] stringsOfBraveNewWord = braveNewWord.split("");
        for (int i = 0; i < stringsOfBraveNewWord.length; i++) {
            System.out.print(stringsOfBraveNewWord[i].repeat(2));
        }
        System.out.println("");
        //Второй способ
        char[] charsOfBraveNewWord = braveNewWord.toCharArray();
        for (int i = 0; i < charsOfBraveNewWord.length; i++) {
            System.out.print(charsOfBraveNewWord[i]);
            System.out.print(charsOfBraveNewWord[i]);
        }
    }
}
