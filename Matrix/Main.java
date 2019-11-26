import java.util.Scanner;

public class Main {
    private static int x1, x2, y1, y2;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int act = 7;
        int number = 0;
        int multiplier = 0;

        System.out.println("Введите данные первой матрицы ");
        x1 = in.nextInt();
        x2 = in.nextInt();
        y1 = in.nextInt();
        y2 = in.nextInt();
        Matrix2 a = new Matrix2(x1, x2, y1, y2);
        System.out.println("Введите данные второй матрицы ");
        x1 = in.nextInt();
        x2 = in.nextInt();
        y1 = in.nextInt();
        y2 = in.nextInt();
        Matrix2 b = new Matrix2(x1, x2, y1, y2);
        System.out.println( "Выберите действие: \n" +
                            "Для сложения матриц введите 1\n" +
                            "Для вычитания матриц введите 2\n" +
                            "Для умножения матрицы на число введите 3\n" +
                            "Для перемножения матриц введите 4\n" +
                            "Для вычисления определителя введите 5\n" +
                            "Для вычисления обратной матрицы введите 6\n" +
                            "Для выключения программы введите 0\n");

        while(act !=0){
            act = in.nextInt();
            if(act == 1){
                Matrix2.sum(a,b);
            }
            if(act == 2){
                Matrix2.raznost(a,b);
            }
            if(act == 3){
                Matrix2.multiplication1(number, multiplier, a, b);
            }
            if(act == 4){
                Matrix2.multiplication2(a,b);
            }
            if(act == 5){
                Matrix2.opredelitel(number, a, b);
            }
            if(act == 6){
                Matrix2.obratnaya(number, multiplier, a, b);
            }
        }
    }
}