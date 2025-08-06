import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor, cont=1, resultado;
        System.out.println("digite um valor");
        valor= sc.nextInt();
        if (valor<=0){
            System.out.println("o valor tem que ser maior que zero");
        }
        else {
        for (;cont<=valor;cont++) {
            resultado=valor%cont;
            if (resultado==0&&cont>=2){

            }

        }
            System.out.println("o número é primo");
        }
    }
}
