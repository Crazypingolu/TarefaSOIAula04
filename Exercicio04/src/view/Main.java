package view;
import controller.ClasseThreads;
public class Main {
    public static void main(String[] args) {
        // Definir variáveis:
        int sapo = 0;
        // envia os sapos para threads unicas:
        for (int i = 0; i < 5; i++) {
            ClasseThreads t = new ClasseThreads(sapo, i);
            t.start();   
        }
    }
}
