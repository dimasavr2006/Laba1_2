import java.util.Random;

import static java.lang.Math.*;
public class Main {

// Массивы
static short[] z1 = new short[8];
static float[] x = new float[13];
static double[][] z = new double[z1.length][x.length];
// Конец массивов

    public static double generator(short[] z1, float[] x) {
        double gen = 0;
        for (int i = 0; i < z1.length; i++){
            for (int j = 0; j < x.length; j++){
                if (z1[i] == 19){
                    gen = sin(log(sqrt(abs(x[j]))));
                    return gen;
                }
                else if (z1[i] == 5 || z1[i] == 7 || z1[i] == 9 || z1[i] == 15){
                    gen = tan(tan(tan(x[j])));
                    return gen;
                }
                else{
                    gen = log(pow((pow((sin(pow((PI / (exp(x[j]) + 0.5)), (pow((2*(0.75 - x[j])), 3))))), 2)), 2));
                    return gen;
                }
            }
        }
        return gen;
    }

    public static short[] calculation1 (short[] z1) {

        for (short i = 0; i < z1.length; i++) {
            z1[i] = (short) ((2 * i) + 5);
//            System.out.println(z1[i]);
        }
        return z1;
    }

    public static float[] calculation2 (float[] x) {

        for (int i = 0; i < x.length; i++) {
            Random random = new Random();
            float random_number = random.nextFloat(-13, 2);
            x[i] = random_number;
//            System.out.println(x[i]);
        }
        return x;
    }

//    public static  calculation3 () {
//        double[][] z = new double[8][13];
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 13; j++) {
//                z[i][j] = generator();
//            }
//        }
//    }
//
//    public static void sender(String[] args){
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 13; j++) {
//                System.out.printf("%.4f", z[i], z[j]);
//            }
//        }
//
//    }
public static double sender_calc(short[] z1[], float[] x[]) {

        for (short i = 0; i < z1.length; i++) {
            for (int j = 0; j < x.length; j++) {
                z[(int)i][j] = (double) generator((short[]) z1[i], x[j]);
            }
        }
    }



    public static void main(String[] args) {
        System.out.println(sender_calc((short[]) z1, (float[]) x[]));
    }



}
