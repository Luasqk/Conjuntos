package ATV;

import java.util.Scanner;

public class alg1 {
    public static boolean valor8(int a, int b) {
        if(2*a + b == 8){
            return true;
        }
        else return false;
        //verificacao do resultado da funcao
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.println("2x + y = 8\n");
        System.out.println("Digite um valor para x: ");
        a = scanner.nextInt();

        System.out.println("Digite um valor para y: ");
        b = scanner.nextInt();

        if(valor8(a,b)){
            System.out.println("A função está correta");
        }
        else{
            System.out.println("A função é falsa");
        }
        //o que é feito com o true ou false
    }
}
