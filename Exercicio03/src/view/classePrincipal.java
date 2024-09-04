package view;
import controller.threadVetor;
import java.util.Random;
public class classePrincipal {
    public static void main(String[] args) {
        // Definir variáveis:
        Random ran = new Random();
        int[] vet = new int[1000];
        // Gerar números aleatórios (diferente do Exe 02, com nextInt):
        for (int i = 0; i < vet.length; i++) {
            vet[i] = ran.nextInt(100);            
        }
        for (int j = 1; j < 3; j++) {
            threadVetor t = new threadVetor(j, vet);
            t.run();
        }

    }
}
