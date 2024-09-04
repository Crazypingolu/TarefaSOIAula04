package view;
import controller.ClasseThreads;
public class Main {
    public static void main(String[] args) {
        // Definir variáveis:
        int sapo = 0;
        /*
         * Por que Podium virou uma matriz?
         * o valor de linha [0] vai ser usado de flag para travar o lugar no podium para evitar
         * que os sapos que cheguem depois e seus valores sejam maiores que os anteriores
         * não substituam os que chegaram antes sendo então:
         * valor de linha [0] == 0 -> disponível.
         * valor de linha [0] == 1 -> indisponível.
         */
        // envia os sapos para threads unicas:
        for (int i = 0; i < 5; i++) {
            ClasseThreads t = new ClasseThreads(sapo, i);
            t.start();   
        }
    }
}
