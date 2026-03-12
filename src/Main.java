import java.util.Scanner;

// Повторная отправка тестового задания

public class Main {

    public static void main(String[] args) {
        // Scanner для чтения ввода из консоли
        Scanner scanner = new Scanner(System.in);


        // Задание 1: два целых числа

        System.out.println("Задание 1.");
        System.out.println("Введите два целых числа a и b через пробел (например: 10 5):");

        int a;
        int b;

        // Читаем два целых числа одной строкой
        while (true) {
            String line = scanner.nextLine().trim();

            // Разбиваем строку по пробелам (и любым пробельным символам)
            String[] parts = line.split("\\s+");

            if (parts.length != 2) {
                System.out.println("Ошибка ввода. Нужно ввести ровно ДВА целых числа через пробел. Повторите:");
                continue;
            }

            try {
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[1]);
                break; // корректный ввод - выходим из цикла
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода. Введите именно целые числа (например: -3 15). Повторите:");
            }
        }

        // Сравнение a и b
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        // Деление
        if (b == 0) {
            System.out.println("a / b = деление на ноль невозможно");
        } else {
            // Деление int/int даёт целое число (целочисленное деление)
            System.out.println("a / b = " + (a / b));
        }

        System.out.println();

        // Задание 2: две строки

        System.out.println("Задание 2.");
        System.out.println("Введите строку a:");
        String s1 = scanner.nextLine(); // строка может быть и пустой

        System.out.println("Введите строку b:");
        String s2 = scanner.nextLine();

        // Сравнение строк по содержимому
        if (s1.equals(s2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        System.out.println();


        // Задание 3: чётные числа массива

        System.out.println("Задание 3.");
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Чётные числа массива [1..10]:");
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }

        scanner.close();
    }
}
