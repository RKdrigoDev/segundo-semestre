import java.util.Scanner;

public class fracao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int quant;
        double cont=1, fracao=0;
        System.out.println("digite uma quantidade de frações que serão somados");
        quant= sc.nextInt();
        if (quant==0){
            System.out.println("não dá pra dividir por 0");
        }
        else {
            for ( ; cont<=quant; cont++){
                if (cont%2==0) {
                    fracao=fracao-1.0/cont;
                }
                else {
                    fracao=fracao+1.0/cont;
                }
            }
            System.out.println(" o total será de "+fracao);
        }
    }
}
