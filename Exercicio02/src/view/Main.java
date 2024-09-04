package view;
import controller.Threads;
public class Main {
    public static void main(String[] args) {
        // Definir variáveis:
        int[][] mat = new int[3][5];
        int[] veThreads = new int[5];
        // Preencher a matriz
        for(int i = 0; i < mat.length; i++){ // Linha
            for(int j = 0; j < mat[0].length; j++){ // Coluna
                mat[i][j] = (int) (Math.random() * 10) + 1; // gera um número de 1 a 10
            }
        }
        // Preenche o vetor e manda pra threads:
        for(int i = 0; i < mat.length; i++){ // Linha
            for(int j = 0; j < mat[i].length; j++){ // Coluna
                veThreads[j] = mat[i][j];
            }
            Threads t = new Threads(veThreads);
            t.run(); // não sei porque start() não funcionou e run() sim
        }
    }
}
