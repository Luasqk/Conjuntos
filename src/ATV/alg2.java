package ATV;

public class alg2 {
    //Exibe a tabela de verdade para a sentença p(x, y): 2x + y = 8
    public static void valor8(int[] a, int[] b) {
        for (int x : a) {
            for (int y : b) {
                if (2 * x + y == 8) {
                    System.out.println("p(" + x + "," + y + ") = " + true);
                } else
                    System.out.println("p(" + x + "," + y + ") = " + false);
            }
        }
    }
    // (∀x ∈ A)(∃y ∈ B) p(x,y)
    public static boolean paraTodoXExisteY(int[] a, int[] b) {
        for (int x : a) {
            boolean achouY = false;

            for (int y : b) {
                if (2 * x + y == 8) {
                    achouY = true;
                    break;
                }
            }
            if(!achouY){
                return false;
            }
        }
        return true;
    }
    //(∃x ∈ A)(∀y ∈ B) ¬p(x,y)
    public static boolean nParaTodoXexisteY(int[] a, int[] b) {
        for (int x : a) {
            boolean falhouPTodoY = true;
            for (int y : b) {
                if (2 * x + y == 8) {
                    falhouPTodoY = false;
                    break;
                }
            }
            if(falhouPTodoY){
                return true;
            }
        }
        return false;
    }
    //(∃x ∈ A)(∀y ∈ B) p(x,y)
    public static boolean existeXParaTodoY(int[] a, int[] b) {
        for (int x : a) {
            boolean serveParaTodos = true;

            for (int y : b) {
                if (2 * x + y != 8) {
                    serveParaTodos = false;
                    break;
                }
            }
            if(serveParaTodos){
                return true;
            }
        }
        return false;
    }
    //(∀x ∈ A)(∃y ∈ B) ¬p(x,y)
    public static boolean nExisteXParaTodoY(int[] a, int[] b){
        for (int x : a) {
            boolean achouY = false;

            for (int y : b) {
                if (2 * x + y != 8) {
                    achouY = true;
                    break;
                }
            }
            if(!achouY){
                return false;
            }
        }
        return true;
    }
    //(∀y ∈ B)(∃x ∈ A) p(x,y)
    public static boolean paraTodoYExisteX(int[] a, int[] b) {
        for (int y : b) {
            boolean achouX = false;
            for (int x : a) {
                if (2 * x + y == 8) {
                    achouX = true;
                    break;
                }
            }
            if(!achouX){
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        int[] b = new int[]{0,2,4,6,8};

        System.out.println("EXERCICIO 1: \n\n");

        valor8(a,b);

        System.out.println("\n(∀x ∈ A)(∃y ∈ B) p(x,y)");
        System.out.println(paraTodoXExisteY(a,b));

        System.out.println("\n(∃x ∈ A)(∀y ∈ B) p(x,y)");
        System.out.println(existeXParaTodoY(a,b));

        System.out.println("\n(∀y ∈ B)(∃x ∈ A) p(x,y)");
        System.out.println(paraTodoYExisteX(a,b));

        System.out.println("\n\nEXERCICIO 2: \n");

        System.out.println("\n(∀x ∈ A)(∃y ∈ B) p(x,y)");
        System.out.println(paraTodoXExisteY(a,b));

        System.out.println("\n(∃x ∈ A)(∀y ∈ B) ¬p(x,y)");
        System.out.println(nParaTodoXexisteY(a,b));

        System.out.println("\n(∃x ∈ A)(∀y ∈ B) p(x,y)");
        System.out.println(existeXParaTodoY(a,b));

        System.out.println("\n(∀x ∈ A)(∃y ∈ B) ¬p(x,y)");
        System.out.println(nExisteXParaTodoY(a,b));

        System.out.println("EXERCÍCIO 3: ");
        System.out.println("Sentença p(x, y): x + y é par\n");

        //Verificações
        System.out.println("1. (∀x ∈ A)(∃y ∈ B) p(x,y)");
        System.out.println("Resultado: " + paraTodoXExisteY(a, b));

        //Para ser par, se x é ímpar, y deve ser ímpar.
        // Mas no conjunto B só há pares, sendo assi, os números
        // ímpares de x não encontrarão y.

        System.out.println("\n2. (∃x ∈ A)(∀y ∈ B) p(x,y)");
        System.out.println("Resultado: " + existeXParaTodoY(a, b));

        System.out.println("\n3. Negação: ¬[(∃x ∈ A)(∀y ∈ B) p(x,y)]");
        System.out.println("Resultado: " + !existeXParaTodoY(a, b));

        // Usando a função lógica de negação:
        System.out.println("Validando via algoritmo de negação: " + nExisteXParaTodoY(a, b));

    }
}