// Dado uma matriz quadrada de ordem 3 de valores reais faça um algoritmo que faça a
//leitura destes valores e ao final da leitura de todos, imprimirem os seguintes relatórios:
//a) Qual a Soma dos valores de cada coluna da matriz;
//b) Listar os valores que são menores que a média dos valores;
//c) Qual a soma dos elementos da diagonal secundária;
public class M007 {
    public static void main(String[] args) {
        int[][] matriz = { { 3, 1, 2 }, { 1, 4, 3 }, { 2, 3, 17 } };
        int total = 0;

            //ler e somar todos os valores
            //p

        total = M007.somarMatriz(matriz);
        System.out.println("Total: " + total);
        M007.listarMedia(matriz);
    }

    private static int somarMatriz(int[][] matriz) {
        int soma = 0;

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                    soma += matriz[i][j];
                }
            }
        return soma;
    }

    private static int listarMedia(int[][] matriz) {
        int soma = 0;
        int count = 0;
        int media = 0;
        int m = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                    soma += matriz[i][j];
                    count++;
            }
        }
        media = (soma / count);
        System.out.println("Media: " + media);
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                    if(matriz[i][j] < media) {
                        System.out.println("Valores menores: " + matriz[i][j]);
                    }
            }
        }
        return media;
    }
}
