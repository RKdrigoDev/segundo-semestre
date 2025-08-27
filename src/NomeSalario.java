import java.text.DecimalFormat;
import java.util.Scanner;

public class NomeSalario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#,##0.00");
        int pessoas, posicao=0;
        double total=0, media, aux=0;
        System.out.println("digite a quantidade de funcionários");
        pessoas= sc.nextInt();
        String[] nome=new String[pessoas];
        double[] salario=new double[pessoas];
        for (int i = 0; i < nome.length; i++){
            System.out.println("nome do funcionário"+(i+1));
            nome[i]=sc.next();
            System.out.println("salario do funcionário "+nome[i]);
            salario[i]=sc.nextDouble();
            total=total+salario[i];
            if (salario[i]>aux){
                aux=salario[i];
                posicao=i;


            }

        }
        media=total/pessoas;
        System.out.println("maior salário "+aux+" e é do funcionario"+nome[posicao]);
        System.out.println("total gasto pela empresa em sálario: "+df.format(total));
        System.out.println("média salarial é "+media);
    }
}
