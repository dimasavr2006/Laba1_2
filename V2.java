import java.util.Random;
import static java.lang.Math.*;


public class V2 {
    //Массивы
    public static short z1[] = new short[8];
    public static float x[] = new float[13];
    public static double z[][] = new double[z1.length][x.length];
    //Конец массивов

//    public static short[] calc1(short z1[]){
//        for(short i=0; i<z1.length; i++){
//            z1[i] = (short)((i * 2) + 5);
////            System.out.println(z1[i]);
//        }
//        return z1;
//    }

//    public static float[] calc2(float x[]){
//        Random random = new Random();
//        for(int i=0; i<x.length; i++){
//            float rand = random.nextFloat(-13, 2);
//            x[i] = rand;
////            System.out.println(x[i]);
//        }
//        return x;
//    }

    public static double calc3(int i, int j){
        double back;
                if (i == 19){
                    back = sin(log(sqrt(abs(x[j]))));
                    return back;
                }
                else if (z1[i] == 5 || z1[i] == 7  || z1[i] == 9 || z1[i] == 15){
                    back = tan(tan(tan(x[j])));
                    return back;
                }
                else{
                    back = log(pow((pow((pow((PI / (exp(x[j] + 0.5))), (pow((2 * (0.75 - x[j])), 3)))), 2)), 2));
                    return back;
                }
    }
public static void main(String[] args) {

    for(short i=0; i<z1.length; i++){
        z1[i] = (short)((i * 2) + 5);
//            System.out.println(z1[i]);
    }

    Random random = new Random();
    for(int i=0; i<x.length; i++){
        float rand = random.nextFloat(-13, 2);
        x[i] = rand;
//            System.out.println(x[i]);
    }
    System.out.println("____________________________________________________________________________________________________________________________________________________________");
    for (int i=0; i<z1.length; i++){
        for(int j=0; j<x.length; j++){
            z[i][j] = calc3(i, j);
            int num = 15;
            String check = String.valueOf(z[i][j]);
            int end = check.indexOf(".") + 4;
            String check2 = check.substring(end);
            int number = num - check2.length() + 2;
            String infinity = "Infinity";
            if (check.equals(infinity)){
                number = 1;
            }
            else{
                number = num - check2.length();
            }
            System.out.print("|");
            System.out.print(" ".repeat(number));
            System.out.printf("%.4f", z[i][j]);
            System.out.print(" ".repeat(number));
            }
        System.out.print("|");
        System.out.println();
        System.out.println("____________________________________________________________________________________________________________________________________________________________");
    }
}







}
