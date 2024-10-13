import java.util.Random;

import static java.lang.Math.*;

public class V3 {

    private short z1[] = new short[8];
    private float x[] = new float[13];
    private double z[][] = new double[z1.length][x.length];

    private void calc1(){
        for(short i = 0; i < z1.length; i++){
            z1[i] = (short)((i * 2) + 5);
//            System.out.println(z1[i]);
        }
    }
    private void calc2(){
        Random random = new Random();
        for(int i=0; i<x.length; i++){
            float rand = random.nextFloat(-13, 2);
            x[i] = rand;
//            System.out.println(x[i]);
        }
    }
    private void calc3(){
        for(int i=0; i<z1.length; i++){
            for(int j=0; j<x.length; j++){
                if (z1[i] == 19){
                    z[i][j] = sin(log(sqrt(abs(x[j]))));
                }
                else if (z1[i] == 5 || z1[i] == 7  || z1[i] == 9 || z1[i] == 15){
                    z[i][j] = tan(tan(tan(x[j])));
                }
                else{
                    z[i][j] = log(pow((pow((pow((PI / (exp(x[j] + 0.5))), (pow((2 * (0.75 - x[j])), 3)))), 2)), 2));
                }
            }
        }
    }

    private void printer(){
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________________");
        for (short i = 0; i < z1.length; i++){
            for (short j = 0; j < x.length; j++){ int num = 15;
                String check = String.valueOf(z[i][j]);
                int end = check.indexOf(".") + 5;
                String check2 = check.substring(end);
                int number = num - check2.length()-1;
                String infinity = "Infinity";
                if (check.equals(infinity)){
                    number = 2;
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
            System.out.println("_______________________________________________________________________________________________________________________________________________________________________________");
        }
    }

    public void calcRunner(){
        calc1();
        calc2();
        calc3();
        printer();
    }
    public static void main(String[] args) {
        V3 alls = new V3();
        alls.calcRunner();
    }
}
