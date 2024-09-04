package controller;
import java.util.Random;
public class ClasseMetodos {
    Random rand = new Random();
    public int[] aux;
    // gerar os pulos e verificar:
    public void salto(int[] sapo){
        for (int i = 0; i < 5; i++) {
            if (sapo[i] < 20)
                sapo[i] = geraNum();
        }
    }
    // Gerar os números:
    public int geraNum(){
        int num = 0;
        num = rand.nextInt(9) + 1;
        return num;
    }
    // Classificar posição dos sapos:
    public void classifica(int[] sapo, int[] pod) {
        //
    }
}
