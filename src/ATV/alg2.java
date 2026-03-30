package ATV;

public class alg2 {
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
    }
}