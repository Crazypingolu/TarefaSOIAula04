package controller;
import java.util.Random;
public class ClasseMetodos {
    Random rand = new Random();
    public int[] aux;
    // gerar os pulos e verificar:
    public int[] salto(int[] sapo){
        int num;
        for (int i = 0; i < 5; i++) {
            num = geraNum();
            if(sapo[i] < 20){
                sapo[i] += num;
                System.out.println("O Sapo "+ (i+1) + " pulou: " + num + "m");
                if(sapo[i] > 19){
                    System.out.println("Sapo " + (i+1) + " chegou!");
                }
            }
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
            for (int j = 0; j < 5; j++) {
                if (sapo[i] < sapo[j]) {
                    aux[i] -= 1;
                }
            }
            aux[i] *= -1;
        }
        return pod;
    }
}