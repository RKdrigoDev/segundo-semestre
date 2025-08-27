
import java.util.Random;

public class gerar_numero {
    public static void main(String[] args) {
        Random r = new Random();
        int[] valor = new int[10];
        boolean achou;
        int num;
        for (int i = 0; i <valor.length;){
            num=r.nextInt(1,11);
            achou = false;
            for (int k=0; k<i;k++){
                if (valor[k]== num){
                    achou = true;
                    break;
                }


            }
            if (achou==false){
                valor[i]=num;
                System.out.println(""+valor[i]);
                i++;
            }

        }


    }
}
