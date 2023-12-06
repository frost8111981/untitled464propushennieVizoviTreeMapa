package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        MissedCall missedCall = new MissedCall();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Программа: пропущенные вызовы.\n" +
                    "\n" +
                    "Меню:\n" +
                    "1. Добавить контакт\n" +
                    "2. Добавить пропущенный вызов\n" +
                    "3. Вывести все пропущенные вызовы\n" +
                    "4. Очистить пропущенные вызовы\n" +
                    "5. Выход");

            System.out.print("Выберите пункт из меню (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем \n после ввода числа
            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите фамилию: ");
                    String surname = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    String phone = scanner.nextLine();
                    System.out.print("Выберите группу контакта (1 - Работа, 2 - Друзья, 3 - Семья): ");
                    int groupChoice = scanner.nextInt();
                    scanner.nextLine(); // Считываем \n после ввода числа

                    Group group;
                    switch (groupChoice) {
                        case 1:
                            group = Group.WORK;
                            break;
                        case 2:
                            group = Group.FRIENDS;
                            break;
                        case 3:
                            group = Group.FAMILY;
                            break;
                        default:
                            System.out.println("Неверный выбор группы. Контакт не будет добавлен.");
                            continue;
                    }

                    contacts.addContact(name, surname, phone, group);
                    System.out.println("Контакт добавлен.");
                    break;

                case 2:
                    System.out.print("Добавьте номер пропущенного вызова: ");
                    String missedCallPhone = scanner.nextLine();
                    missedCall.addMissedCall(missedCallPhone);
                    System.out.println("Пропущенный вызов добавлен.");
                    break;

                case 3:
                    String missedCallList = missedCall.getMissedCalls();
                    if (missedCallList.isEmpty()) {
                        System.out.println("Пропущенных вызовов нет.");
                    } else {
                        System.out.println("Список пропущенных вызовов:\n" + missedCallList);
                    }
                    break;

                case 4:
                    missedCall.clearMissedCalls();
                    System.out.println("Пропущенные вызовы очищены.");
                    break;

                case 5:
                    System.out.println("Выход");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте ещё раз.");
                    break;
            }
        }
    }
}
