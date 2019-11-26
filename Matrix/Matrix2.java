import java.util.Scanner;

public class Matrix2 {
    private int x1, x2, y1, y2;
    public Matrix2(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public Matrix2(){
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
    }
    public static Matrix2 sum(Matrix2 a, Matrix2 b){
        System.out.println("Полученная матрица: ");
        Matrix2 sum = new Matrix2();
        sum.x1 = a.x1+b.x1;
        sum.x2 = a.x2+b.x2;
        sum.y1 = a.y1+b.y1;
        sum.y2 = a.y2+b.y2;
        printmatrix(sum);
        return sum;
    }
    public static Matrix2 raznost(Matrix2 a, Matrix2 b){
        System.out.println("Полученная матрица: ");
        Matrix2 raznost = new Matrix2();
        raznost.x1 = a.x1-b.x1;
        raznost.x2 = a.x2-b.x2;
        raznost.y1 = a.y1-b.y1;
        raznost.y2 = a.y2-b.y2;
        printmatrix(raznost);
        return raznost;
    }
    public static Matrix2 multiplication1(int number, int multiplier, Matrix2 a, Matrix2 b){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер матрицы: ");
        number = in.nextInt();
        System.out.println("Введите число, на которое вы хотите умножить матрицу ");
        multiplier = in.nextInt();
        if(number == 1){
            System.out.println("Полученная матрица: ");
            Matrix2 multiplication1 = new Matrix2();
            multiplication1.x1 = a.x1*multiplier;
            multiplication1.x2 = a.x2*multiplier;
            multiplication1.y1 = a.y1*multiplier;
            multiplication1.y2 = a.y2*multiplier;
            printmatrix(multiplication1);
            return multiplication1;
        }
        if(number == 2){
            System.out.println("Полученная матрица: ");
            Matrix2 multiplication1 = new Matrix2();
            multiplication1.x1 = b.x1*multiplier;
            multiplication1.x2 = b.x2*multiplier;
            multiplication1.y1 = b.y1*multiplier;
            multiplication1.y2 = b.y2*multiplier;
            printmatrix(multiplication1);
            return multiplication1;
        }
        if(number != 1 && number != 2){
            System.out.println("Матрица выбрана некорректно. Попробуйте еще раз: ");
            return null;
        }
        return null;
    }
    public static Matrix2 multiplication2(Matrix2 a, Matrix2 b){
        System.out.println("Полученная матрица: ");
        Matrix2 multiplication2 = new Matrix2();
        multiplication2.x1 = a.x1*b.x1+a.x2*b.y1;
        multiplication2.x2 = a.x1*b.x2+a.x2*b.y2;
        multiplication2.y1 = a.y1*b.x1+a.y2*b.y1;
        multiplication2.y2 = a.y1*b.x2+a.y2*b.y2;
        printmatrix(multiplication2);
        return multiplication2;
    }
    public static void opredelitel(int number, Matrix2 a, Matrix2 b){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер матрицы: ");
        number = in.nextInt();
        if(number == 1){
            System.out.println("Определитель первой матрицы: " + (a.x1*a.y2-a.x2*a.y1));
        }
        if(number == 2){
            System.out.println("Определитель второй матрицы: " + (b.x1*b.y2-b.x2*b.y1));
        }
        if(number != 1 && number != 2){
            System.out.println("Матрица выбрана некорректно. Попробуйте еще раз: ");
        }
    }
    public static void obratnaya(int number, int multiplier, Matrix2 a, Matrix2 b){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер матрицы: ");
        number = in.nextInt();
        if(number == 1){
            multiplier = (a.x1*a.y2-a.x2*a.y1);
            if(multiplier != 0) {
                System.out.println("Полученная матрица: 1/" + multiplier);
                System.out.println((a.y2 * multiplier) + " " + (-1 * a.y1 * multiplier));
                System.out.println((-1 * a.x2 * multiplier) + " " + (a.x1 * multiplier));
            }
            else{
                System.out.println("Определитель равен 0, обратной матрицы не существует");
            }
        }
        if(number == 2){
            multiplier = (b.x1*b.y2-b.x2*b.y1);
            if(multiplier != 0) {
                System.out.println("Полученная матрица: 1/" + multiplier);
                System.out.println((b.y2 * multiplier) + " " + (-1 * b.y1 * multiplier));
                System.out.println((-1 * b.x2 * multiplier) + " " + (b.x1 * multiplier));
            }
            else{
                System.out.println("Определитель равен 0, обратной матрицы не существует");
            }
        }
        if(number != 1 && number != 2){
            System.out.println("Матрица выбрана некорректно. Попробуйте еще раз: ");
        }
    }
    public static void printmatrix(Matrix2 a) {
        System.out.println(a.x1 + " " + a.x2 );
        System.out.println(a.x1 + " " + a.x2 );
    }
}