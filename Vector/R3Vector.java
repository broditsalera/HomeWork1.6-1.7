import java.util.Scanner;

public class R3Vector{
    private int x, y, z;
    public R3Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public R3Vector(){
        x = 0;
        y = 0;
        z = 0;
    }
    public static R3Vector sum(R3Vector a, R3Vector b){
        R3Vector sum = new R3Vector();
        sum.x = a.x + b.x;
        sum.y = a.y + b.y;
        sum.z = a.z + b.z;
        printvector(sum);
        return sum;
    }
    public static R3Vector raznost(R3Vector a, R3Vector b){
        R3Vector raznost = new R3Vector();
        raznost.x = a.x - b.x;
        raznost.y = a.y - b.y;
        raznost.z = a.z - b.z;
        printvector(raznost);
        return raznost;
    }
    public static R3Vector multiplication(int number, int multiplier, R3Vector a, R3Vector b){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер вектора: ");
        number =  in.nextInt();
        System.out.println("Введите число, на которое вы хотите умножить вектор: ");
        multiplier =  in.nextInt();
        if (number == 1){
            R3Vector multiplication = new R3Vector();
            multiplication.x = a.x * multiplier;
            multiplication.y = a.y * multiplier;
            multiplication.z = a.z * multiplier;
            printvector(multiplication);
            return multiplication;
        }
        if (number == 2){
            R3Vector multiplication = new R3Vector();
            multiplication.x = b.x * multiplier;
            multiplication.y = b.y * multiplier;
            multiplication.z = b.z * multiplier;
            printvector(multiplication);
            return multiplication;
        }
        if(number != 1 && number !=2){
            System.out.println("Вектор выбран некорректно. Попробуйте еще раз: ");
            return null;
        }
        return null;
    }
    public static void skalyarm(R3Vector a, R3Vector b){
        System.out.println("Скалярное произведение: " + a.x * b.x + a.y * b.y + a.z * b.z);
    }
    public static R3Vector vectorm(R3Vector a, R3Vector b){
        R3Vector vectorm = new R3Vector();
        vectorm.x = a.y * b.z - a.z * b.y;
        vectorm.y = a.z * b.x - a.x * b.z;
        vectorm.z = a.x * b.y - a.y * b.x;
        printvector(vectorm);
        return vectorm;
    }
    public static void mixedm(R3Vector a, R3Vector b, R3Vector c){
        System.out.println("Введите координаты третьего вектора: ");
        System.out.println("Смешанное произведение: " + (c.x * (a.y * b.z - a.z * b.y) - c.y * (a.z * b.x - a.x * b.z) + c.z * (a.x * b.y - a.y * b.x)));
    }
    public static void printvector(R3Vector a){
        System.out.println("{" + a.x + ", " + a.y + ", " + a.z + "}");
    }
}