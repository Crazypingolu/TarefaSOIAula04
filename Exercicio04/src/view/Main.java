package view;
import controller.ClasseThreads;
public class Main {
    public static void main(String[] args) {
        // Definir variáveis:
        int[] sapo = new int[5];
        int[][] podium = new int[2][5];
        // preenche os vetores:
        for (int i = 0; i < 5; i++) {
            sapo[i] = 0;
            podium[0][i] = 0;
            podium[1][i] = 0;           
        }
        // envia os os sapo e rank:
        ClasseThreads t = new ClasseThreads(sapo, podium);
        t.run();
    }
}
