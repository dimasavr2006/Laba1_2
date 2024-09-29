import java.util.Random;

public class Myself {

    public static double generation(short z, double x){

        double back;

        if (x==18) {

            back = Math.tan(0.75 * (Math.log(Math.abs(x)) - 1));
        }

        else if (x==12 || x==14 || x==16) {


                back = (2 + Math.atan(0.4 * (x + 0.5)/(27)))/(4);
        }


            else{
                back = Math.sin(Math.pow((Math.log(4*(Math.abs(x)+1))), (Math.pow((4/(Math.atan((x+0.5)/27))), (3)))));
        }

        return back;
    }


    public static void main(String[] args) {

        short z[] = new short[13];
        for (int i = 0; i < 13; i++) {

            z[i] = (short) (18-i);
            System.out.println(z[i]);

        }

        double x[] = new double[13];
                for (int i = 0; i < 13; i++) {
                    Random random = new Random();
                    int rand  = random.nextInt(-13, 14);
                    x[i] = rand;
                    System.out.println(x[i]);
                }


        double z1[][] = new double[7][13];
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 13; j++) {
                        z1[i][j] = (int) (int) generation(z[i], z[j]);
                    }
                }

                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 13; j++) {
                        System.out.printf("%.2f", z1[i],z1[j]);
                    }
                }

    }

}
