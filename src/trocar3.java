import java.util.Scanner;

/*programa em Java para ler um valor inteiro. Se o valor for par imprimir uma mensagem informando que ele é par e também imprimir o dobro do número. Se o valor for ímpar, imprimir uma mensagem e o triplo do número
*/
public class trocar3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor;
        System.out.println("valo:");
        valor= sc.nextInt();
        switch (valor % 2){
            case 0-> {
                System.out.println("par");
                System.out.println(2*valor);
            }
            case 1 -> {
                System.out.println("ímpar");
                System.out.println(3*valor);
            }

        }

    }

}
