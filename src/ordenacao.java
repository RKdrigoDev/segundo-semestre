import java.util.Random;

public class ordenacao {
    public static void main(String[] args) {
        Random r = new Random();
        int[] x = new int[10];
        int aux;
        //antes
        System.out.println("antes da ordenação");
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(55);
            System.out.println(x[i] + " ");
        }
        for (int k=0; k<x.length;k++) {
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] > x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }

            System.out.println("\ndepois da ordenação");
                for (int i = 0; i < x.length; i++) {
                    System.out.println(x[i] + " ");
                }

            }

    }

