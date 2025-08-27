import java.util.Random;

public class ordenacao {
    public static void main(String[] args) {
        Random r = new Random();
        int[] x = new int[10];
        //antes
        System.out.println("antes da ordenação");
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(55);
            System.out.println(x[i]+" ");
        }
        System.out.println("\ndepois da ordenação");
        for (int i=0; i<x.length;i++){
            System.out.println(x[i]+" ");
        }
    }
}
