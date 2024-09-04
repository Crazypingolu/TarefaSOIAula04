package view;
import controller.ClasseThreads;
public class Main {
    public static void main(String[] args) {
        // Definir variáveis:
        int[] sapo = new int[5];
        int[] podium = new int[5];
        // preenche os vetores:
        for (int i = 0; i < 5; i++) {
            sapo[i] = 0;
            podium[i] = 0;           
        }
        // envia os os sapo e rank:
        while (podium[4] < 20) {
            ClasseThreads t = new ClasseThreads(sapo, podium);
            t.run();
        }
    }
}
