import java.util.Scanner;

public class trocar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 4;
        switch (valor){
            case 1, 2 -> System.out.println("A");
            case 3, 4 ->  System.out.println("B");
            case 5, 6 ->   System.out.println("C");
            default -> System.out.println("X");
        }
    }
}
