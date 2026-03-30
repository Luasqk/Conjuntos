package modulo;

import java.util.Scanner;

public class Mod {
    public static int mod(int a, int b){
        while(b != 0){
            int resto = a%b;
            int div = a/b;

            System.out.println(a + " = " + b + " * " + div + " + " + resto );
            a = b;
            b = resto;
        }
        return a;
    }
    static void main() {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ser o dividendo: ");
        a = scanner.nextInt();

        System.out.println("Digite um número para ser o divisor: ");
        b = scanner.nextInt();

        System.out.println("O MDC do cálculo é: "+mod(a,b));
    }
}