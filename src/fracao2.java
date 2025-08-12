import java.util.Scanner;

public class fracao2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int quant, sinal=1;
        double cont=1, fracao=0;
        System.out.println("digite uma quantidade de frações que serão somados");
        quant= sc.nextInt();
        if (quant==0){
            System.out.println("não dá pra dividir por 0");
        }
        else {
            for ( ; cont<=quant; cont++){
                fracao=fracao+1/cont*sinal;
             sinal=sinal*-1;
        }
            System.out.println(+fracao);
    }
}
}
