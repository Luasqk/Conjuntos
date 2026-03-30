import java.util.Scanner;

public class euc {
    public static void eucli(int D, int d){
        int q = D/d;
        int r = D%d;

        System.out.println(D + " = " + d + " * " + q + " + " + r);
    }
    static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ser o dividendo: ");
        a = scanner.nextInt();

        System.out.println("Digite um número para ser o divisor: ");
        b = scanner.nextInt();

        eucli(a,b);
    }
}
