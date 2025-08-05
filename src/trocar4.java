import java.util.Scanner;

/*programa em Java para ler um valor inteiro. Se o valor for par imprimir uma mensagem informando que ele é par e também imprimir o dobro do número. Se o valor for ímpar, imprimir uma mensagem e o triplo do número
*/
public class trocar4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor, resultado;
        System.out.println("valor:");
        valor= sc.nextInt();
        resultado= switch (valor % 2){
            case 0-> {
                System.out.println("par");
                yield 2*valor;
            }
            default -> {
                System.out.println("ímpar");
                yield 3*valor;
            }

        };
        System.out.println(+resultado);

        }

    }


