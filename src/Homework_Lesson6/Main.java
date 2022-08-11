package Homework_Lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard[] arrayOfCreditCards = new CreditCard[3];
        for (int i = 0; i < arrayOfCreditCards.length; i++) {
            arrayOfCreditCards[i] = new CreditCard();
            arrayOfCreditCards[i].addInfoAboutCard();
        }
        System.out.println("Текущая информация и состояние счетов кредитных карт: ");
        arrayOfCreditCards[0].infoAboutCard();
        arrayOfCreditCards[1].infoAboutCard();
        arrayOfCreditCards[2].infoAboutCard();
        for (; ; ) {
            System.out.println("\nВведите номер карты, с которой желаете провести операцию (1, 2 или 3).\nВведите '0' для выхода.\nВведите '10' для просмотра текущей информации обо всех счетах и выхода.");
            switch (scanner.nextInt() - 1) {
                case 0 -> {
                    System.out.println("Вы проводите операцию с первой картой. Какую операцию вы желаете провести?");
                    firstCardOperation:
                    for (; ; ) {
                        switch (scanner.next()) {
                            case "пополнить" -> {
                                System.out.println("Выбрана операция 'Пополнение счета'. Какую сумму желаете внести на счет?");
                                arrayOfCreditCards[0].addMany(scanner.nextDouble());
                                System.out.println("Счет пополнен. Желаете провести другую операцию?");
                                for (; ; ) {
                                    switch (scanner.next()) {
                                        case "да" -> {
                                            System.out.println("Введите операцию, которую хотите провести.");
                                        }
                                        case "нет" -> {
                                            System.out.println("Спасибо за пользование нашими услугами, до свидания!");
                                            break firstCardOperation;
                                        }
                                        default -> {
                                            System.out.println("Введите 'да' или 'нет'");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                continue;
                            }
                            case "снять" -> {
                                System.out.println("Выбрана операция 'Снятие денежных средств'. Какую сумму желаете снять со счета?");
                                double removeSum = scanner.nextDouble();
                                if (arrayOfCreditCards[0].runningSum >= removeSum) {
                                    arrayOfCreditCards[0].withdrawMany(removeSum);
                                } else {
                                    System.out.println("Недостаточно денежных средств! Хотите провести другую операцию?");
                                    for (; ; ) {
                                        switch (scanner.next()) {
                                            case "да" ->
                                                    System.out.println("Введите операцию, которую хотите провести.");
                                            case "нет" -> {
                                                System.out.println("Спасибо за пользование нашими услугами, до свидания!");
                                                break firstCardOperation;
                                            }
                                            default -> {
                                                System.out.println("Введите 'да' или 'нет'");
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                    continue;
                                }
                                System.out.println("Денежные средства сняты. Желаете провести другую операцию?");
                                for (; ; ) {
                                    switch (scanner.next()) {
                                        case "да" -> System.out.println("Введите операцию, которую хотите провести.");
                                        case "нет" -> {
                                            System.out.println("Спасибо за пользование нашими услугами, до свидания!");
                                            break firstCardOperation;
                                        }
                                        default -> {
                                            System.out.println("Введите 'да' или 'нет'");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                continue;
                            }
                            case "инфо" -> {
                                System.out.println("Выбрана операция 'Посмотреть состояние счета'.");
                                System.out.println("Текущее состояние счета: " + arrayOfCreditCards[0].runningSum);
                                System.out.println("Желаете провести другую операцию?");
                                for (; ; ) {
                                    switch (scanner.next()) {
                                        case "да" -> System.out.println("Введите операцию, которую хотите провести.");
                                        case "нет" -> {
                                            System.out.println("Спасибо за пользование нашими услугами, до свидания!");
                                            break firstCardOperation;
                                        }
                                        default -> {
                                            System.out.println("Введите 'да' или 'нет'");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                continue;
                            }
                            default -> {
                                System.out.println("Введите название операции, которую желаете провести ('пополнить', 'снять' или 'инфо').");
                            }
                        }
                        break;
                    }
                    continue;
                }
                case 1 -> {
                    System.out.println("Вы проводите операцию со второй картой. Какую операцию вы желаете провести?");
                    secondCardOperation:
                    for (; ; ) {
                        switch (scanner.next()) {
                            case "пополнить" -> {
                                System.out.println("Выбрана операция 'Пополнение счета'. Какую сумму желаете внести на счет?");
                                arrayOfCreditCards[1].addMany(scanner.nextDouble());
                                System.out.println("Счет пополнен. Желаете провести другую операцию?");
                                for (; ; ) {
                                    switch (scanner.next()) {
                                        case "да" -> {
                                            System.out.println("Введите операцию, которую хотите провести.");
                                        }
                                        case "нет" -> {
                                            System.out.println("Спасибо за пользование нашими услугами, до свидания!");
                                            break secondCardOperation;
                                        }
                                        default -> {
                                            System.out.println("Введите 'да' или 'нет'");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                continue;
                            }
                            case "снять" -> {
                                System.out.println("Выбрана операция 'Снятие денежных средств'. Какую сумму желаете снять со счета?");
                                double removeSum = scanner.nextDouble();
                                if (arrayOfCreditCards[1].runningSum >= removeSum) {
                                    arrayOfCreditCards[1].withdrawMany(removeSum);
                                } else {
                                    System.out.println("Недостаточно денежных средств! Хотите провести другую операцию?");
                                    for (; ; ) {
                                        switch (scanner.next()) {
                                            case "да" ->
                                                    System.out.println("Введите операцию, которую хотите провести.");
                                            case "нет" -> {
                                                System.out.println("Спасибо за пользование нашими услугами, до свидания!");
                                                break secondCardOperation;
                                            }
                                            default -> {
                                                System.out.println("Введите 'да' или 'нет'");
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                    continue;
                                }
                                System.out.println("Денежные средства сняты. Желаете провести другую операцию?");
                                for (; ; ) {
                                    switch (scanner.next()) {
                                        case "да" -> System.out.println("Введите операцию, которую хотите провести.");
                                        case "нет" -> {
                                            System.out.println("Спасибо за пользование нашими услугами, до свидания!");
                                            break secondCardOperation;
                                        }
                                        default -> {
                                            System.out.println("Введите 'да' или 'нет'");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                continue;
                            }
                            case "инфо" -> {
                                System.out.println("Выбрана операция 'Посмотреть состояние счета'.");
                                System.out.println("Текущее состояние счета: " + arrayOfCreditCards[1].runningSum);
                                System.out.println("Желаете провести другую операцию?");
                                for (; ; ) {
                                    switch (scanner.next()) {
                                        case "да" -> System.out.println("Введите операцию, которую хотите провести.");
                                        case "нет" -> {
                                            System.out.println("Спасибо за пользование нашими услугами, до свидания!");
                                            break secondCardOperation;
                                        }
                                        default -> {
                                            System.out.println("Введите 'да' или 'нет'");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                continue;
                            }
                            default -> {
                                System.out.println("Введите название операции, которую желаете провести ('пополнить', 'снять' или 'инфо').");
                            }
                        }
                        break;
                    }
                    continue;
                }
                case 2 -> {
                    System.out.println("Вы проводите операцию с третьей картой. Какую операцию вы желаете провести?");
                    thirdCardOperation:
                    for (; ; ) {
                        switch (scanner.next()) {
                            case "пополнить" -> {
                                System.out.println("Выбрана операция 'Пополнение счета'. Какую сумму желаете внести на счет?");
                                arrayOfCreditCards[2].addMany(scanner.nextDouble());
                                System.out.println("Счет пополнен. Желаете провести другую операцию?");
                                for (; ; ) {
                                    switch (scanner.next()) {
                                        case "да" -> {
                                            System.out.println("Введите операцию, которую хотите провести.");
                                        }
                                        case "нет" -> {
                                            System.out.println("Спасибо за пользование нашими услугами, до свидания!");
                                            break thirdCardOperation;
                                        }
                                        default -> {
                                            System.out.println("Введите 'да' или 'нет'");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                continue;
                            }
                            case "снять" -> {
                                System.out.println("Выбрана операция 'Снятие денежных средств'. Какую сумму желаете снять со счета?");
                                double removeSum = scanner.nextDouble();
                                if (arrayOfCreditCards[2].runningSum >= removeSum) {
                                    arrayOfCreditCards[2].withdrawMany(removeSum);
                                } else {
                                    System.out.println("Недостаточно денежных средств! Хотите провести другую операцию?");
                                    for (; ; ) {
                                        switch (scanner.next()) {
                                            case "да" ->
                                                    System.out.println("Введите операцию, которую хотите провести.");
                                            case "нет" -> {
                                                System.out.println("Спасибо за пользование нашими услугами, до свидания!");
                                                break thirdCardOperation;
                                            }
                                            default -> {
                                                System.out.println("Введите 'да' или 'нет'");
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                    continue;
                                }
                                System.out.println("Денежные средства сняты. Желаете провести другую операцию?");
                                for (; ; ) {
                                    switch (scanner.next()) {
                                        case "да" -> System.out.println("Введите операцию, которую хотите провести.");
                                        case "нет" -> {
                                            System.out.println("Спасибо за пользование нашими услугами, до свидания!");
                                            break thirdCardOperation;
                                        }
                                        default -> {
                                            System.out.println("Введите 'да' или 'нет'");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                continue;
                            }
                            case "инфо" -> {
                                System.out.println("Выбрана операция 'Посмотреть состояние счета'.");
                                System.out.println("Текущее состояние счета: " + arrayOfCreditCards[2].runningSum);
                                System.out.println("Желаете провести другую операцию?");
                                for (; ; ) {
                                    switch (scanner.next()) {
                                        case "да" -> System.out.println("Введите операцию, которую хотите провести.");
                                        case "нет" -> {
                                            System.out.println("Спасибо за пользование нашими услугами, до свидания!");
                                            break thirdCardOperation;
                                        }
                                        default -> {
                                            System.out.println("Введите 'да' или 'нет'");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                continue;
                            }
                            default -> {
                                System.out.println("Введите название операции, которую желаете провести ('пополнить', 'снять' или 'инфо').");
                            }
                        }
                        break;
                    }
                    continue;
                }
                case -1 -> {
                    System.out.println("До свидания!");
                }
                case 9 -> {
                    System.out.println("\nТекущая информация и состояние счетов кредитных карт: ");
                    arrayOfCreditCards[0].infoAboutCard();
                    arrayOfCreditCards[1].infoAboutCard();
                    arrayOfCreditCards[2].infoAboutCard();
                }
                default ->
                        System.out.println("\nВведите номер карты, с которой желаете провести операцию (1, 2 или 3).\nВведите '0' для выхода.\nВведите '10' для просмотра текущей информации обо всех счетах и выхода.");
            }
            break;
        }
    }
}
