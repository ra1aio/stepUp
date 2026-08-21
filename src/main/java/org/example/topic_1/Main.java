package org.example.topic_1;

public class Main {

    public static void main(String[] args) {

        System.out.println(isEven(101));
        System.out.println(checkAccess(188));
        System.out.println(isPositive(123));
        System.out.println(getGrade(101));
        System.out.println(blastOff(17));
        System.out.println(sumToN(10));


    }

    /*Задача 1: разработать метод с сигнатурой publiс static boolean isEven(int n). Метод возвращает true,
                если число чётное, и false — если нечётное.*/
    public static boolean isEven(int n) {

        return n % 2 == 0;

    }

    /*Задача 2: разработать метод с сигнатурой public static String checkAccess(int age). Метод возвращает Allowed,
    если число строго больше 18, и Denied — если меньше.*/
    public static String checkAccess(int age) {
        if (age >= 18) {
            return "Allowed";
        } else {
            return "Denied";
        }
    }

    /*Задача 3: разработать метод с сигнатурой public static boolean isPositive(int n). Метод должен возвращать true,
    если переданное число больше или равно нулю, и false, если переданное число меньше нуля. Проверка внутри метода
    должна происходить с помощью тернарного оператора.*/
    public static boolean isPositive(int n) {

        return n >= 0 ? true : false;
    }

    /*Задача 4: разработать метод с сигнатурой public static String getGrade(int score). Метод возвращает строку,
    соответствующую строгому вхождению в границы:
    0–20: E;
    21–40: D;
    41–60: C;
    61–80: B;
    81–100: A.
    Если переданное число не входит в границы — вернуть строку Error.*/
    public static String getGrade(int score) {
        if (score >= 0 && score <=20) {
            return "E";
        } else if (score >= 21 && score <=40) {
            return "D";
        } else if (score >= 41 && score <=60) {
            return "C";
        } else if (score >= 61 && score <=80) {
            return "B";
        } else if (score >= 81 && score <=100) {
            return "A";
        } else {
            return "Error";
        }
    }

    /*Задача 5: разработать метод с сигнатурой public static String blastOff(int start). Метод принимает стартовое число
    (например, 5) и возвращает строку со всеми числами до 1 и словом «Поехали!» в конце (например, «5 4 3 2 1 Поехали!»).*/
    public static String blastOff(int start) {
        StringBuffer sb = new StringBuffer();
        while (start > 0) {
            sb.append(start).append(" ");
            start--;
        }
        sb.append("Поехали!");

        return sb.toString();
    }

    /*Задача 6: разработать метод с сигнатурой public static int sumToN(int n).
    Метод возвращает сумму всех целых чисел от 1 до n.*/
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
