package ru.levelp;
import java.util.Scanner;
/**
 * Created by Weisekopf on 04.04.16.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("\t === Программа решения однородного линейного уравнения ===");

        float varA, varB, varX;

        Scanner in = new Scanner(System.in); // Создание объекта класса Scanner
        System.out.println("\t Общий вид уравнения: Ax + B = 0");
        System.out.println("\t Введите коэффициент A: ");

        varA = in.nextFloat();

        System.out.println("\t Введите коэффициент B: ");

        varB = in.nextFloat();

        varX = (float) - varB / varA;
        System.out.println("\t Корень уравнения x = " + varX);
        System.out.println("\t === Решение найдено ===");

    }
}
