package ConjSubconj;

import java.util.Scanner;

public class ProcuraConj {
    public static void iniciaVetor(int[] vetor, int x){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < x; i++) {
            System.out.println("Digite um valor para a posição " + i +" :");
            vetor[i] = scanner.nextInt();
        }
    }
    public static void iniciaVetor1a10(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }
    }
    public static void exibeVetor(int[]vetor){
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
    public static String procuraElemento(int x, int[] vetor){
        for (int i : vetor) {
            if (x == i) {
                return "O elemento está no vetor";
            }
        }
        return "O elemento não está no vetor";
    }
    public static boolean verificaSubconjunto(int[] conj, int[] subconj, int tamanhoSubConj){
        for (int i = 0; i < tamanhoSubConj; i++) {
            boolean achou = false;
            for (int j : conj) {
                if (subconj[i] == j) {
                    achou = true;
                    break;
                }
            }
            if(!achou) return false;
        }
        return true;
    }
    public static void comparaconj(int[] conj, int[] subconj) {
        int[] inter = new int[conj.length];
        int[] uniao = new int[conj.length + subconj.length];
        int[] diferenca = new int[conj.length];
        int kInter = 0;
        int kUniao = 0;
        int kDiferenca = 0;

        for (int i = 0; i < conj.length; i++) {
            uniao[kUniao] = conj[i];
            kUniao++;
        }

        for (int i = 0; i < conj.length; i++) {
            boolean existe = false;
            for (int j = 0; j < subconj.length; j++) {
                if (conj[i] == subconj[j]) {
                    inter[kInter] = conj[i];
                    kInter++;
                    existe = true;
                }
            }
            if (!existe) {
                diferenca[kDiferenca] = conj[i];
                kDiferenca++;

            }
        }
        for (int j = 0; j < subconj.length; j++) {
            boolean existe = false;
            for (int i = 0; i < conj.length; i++) {
                if (conj[i] == subconj[j]) {
                    existe = true;
                }
            }
            if (!existe) {
                uniao[kUniao] = subconj[j];
                kUniao++;
            }
        }
        System.out.println("\nUnião: ");
        for (int i = 0; i < kUniao; i++) {
            System.out.print(uniao[i] + " ");
        }

        System.out.println("\n");

        System.out.println("Intersecção: ");
        for (int i = 0; i < kInter; i++) {
            System.out.print(inter[i] + " ");
        }

        System.out.println("\n");

        System.out.println("Diferença: ");
        for (int i = 0; i < kDiferenca; i++) {
            System.out.print(diferenca[i] + " ");
        }
    }
    static void main(String[] args) {
        int elem, tamanhoSubConj;
        int[] conj = new int[10];

        Scanner scanner = new Scanner(System.in);

        iniciaVetor1a10(conj);
        exibeVetor(conj);

        System.out.println();

        System.out.println("Digite um valor para verficar se está contido no vetor: ");
        elem = scanner.nextInt();

        System.out.println();

        System.out.println(procuraElemento(elem, conj));

        System.out.println();

        System.out.println("Digite elementos de um conjunto para ver se ele está contido em A.");
        System.out.println("Primeiro, qual será o tamanho dele? ");
        tamanhoSubConj = scanner.nextInt();

        int[] subconj = new int[tamanhoSubConj];

        System.out.println();

        iniciaVetor(subconj, tamanhoSubConj);

        if(verificaSubconjunto(conj, subconj, tamanhoSubConj)){
            System.out.println("O seu subconjunto está contido em A.");
        }
        else{
            System.out.println("O seu conjunto não está contido em A.");
        }

        comparaconj(conj, subconj);
    }
}