import java.util.Scanner;

public class Main {
    private static int x, y, z;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int act = 7;
        int number = 0;
        int multiplier = 0;
        System.out.println("Введите координаты первого вектора: ");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        R3Vector a = new R3Vector(x, y, z);
        System.out.println("Введите координаты второго вектора: ");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        R3Vector b = new R3Vector(x, y, z);
        R3Vector c = new R3Vector(0, 0, 0);
        System.out.println("Выберите действие: \n" +
                "Для сложения векторов введите 1 \n" +
                "Для вычитания векторов введите 2 \n" +
                "Для умножения вектора на число введите 3 \n" +
                "Для вычисления скалярного произведения введите 4 \n" +
                "Для вычисления векторного произведения введите 5 \n" +
                "Для вычисления смешанного произведения введите 6 \n" +
                "Для выключения программы введите 0 \n");

        while (act != 0) {
            act = in.nextInt();
            if (act == 1) {
                R3Vector.sum(a, b);
            }
            if (act == 2) {
                R3Vector.raznost(a, b);
            }
            if (act == 3) {
                R3Vector.multiplication(number, multiplier, a, b);
            }
            if (act == 4) {
                R3Vector.skalyarm(a, b);
            }
            if (act == 5) {
                R3Vector.vectorm(a, b);
            }
            if (act == 6) {
                R3Vector.mixedm(a, b, c);
            }
        }
    }
}