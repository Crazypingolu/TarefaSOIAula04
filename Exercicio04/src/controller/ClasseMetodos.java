package controller;
import java.util.Random;
public class ClasseMetodos {
    Random rand = new Random();
    public int[] aux;
    // gerar os pulos e verificar:
    public int[] salto(int[] sapo){
        for (int i = 0; i < 5; i++) {
            if (sapo[i] < 20)
                sapo[i] = geraNum();
        }
        return sapo;
    }
    // Gerar os números:
    public int geraNum(){
        int num = 0;
        num = rand.nextInt(9) + 1;
        return num;
    }
    // Classificar posição dos sapos:
    public int[][] classifica(int[] sapo, int[][] pod) {
        // usa o auxiliar com a formula -> se sapo[i] < sapo[j] -> aux[i] -=1 -> fim do for aux[i] *= -1
        for (int i = 0; i < 5; i++) {
            
        }
        return pod;
    }
}
