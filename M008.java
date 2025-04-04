class Matriz {
    private int[][] matriz;


    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public Matriz somar(Matriz outraMatriz) {
        int[][] resultado = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = this.matriz[i][j] + outraMatriz.matriz[i][j];
            }
        }

        return new Matriz(resultado);
    }


    public void exibir() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


public class M008 {
    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };


        Matriz m1 = new Matriz(matriz1);
        Matriz m2 = new Matriz(matriz2);


        Matriz resultado = m1.somar(m2);


        System.out.println("Resultado da soma das matrizes:");
        resultado.exibir();
    }
}
