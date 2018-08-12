
import java.util.Scanner;

public class BmiCalc {
    /* BMI 体格指数を計算するプログラム
     * BMI = 体重　 /  （身長　＊　身長）
     * 体重 kg、身長 m
     */

    public static void main(String[] args) {
        double weight,height,bmi;

        Scanner stdIn = new Scanner(System.in);
        System.out.println("体重は？（ｋｇ）：");
        weight = stdIn.nextDouble();
        System.out.println("身長は？（ｍ）：");
        height = stdIn.nextDouble();
/*
        weight = 71;
        height = 180;
        height /= 100;
 */
        bmi = weight / (height * height);
        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.println("痩せ型です");
        } else if (bmi < 25) {
            System.out.println("標準です");
        } else {
            System.out.println("肥満です");
        }

    }
}
