package controller;
import java.util.Random;
public class ClasseMetodos {
    private int[] rank = new int[5];
    /*
     * Podium matriz?
     * o valor de linha [0] vai ser usado de flag para travar o lugar no podium para evitar
     * que os sapos que cheguem depois e seus valores sejam maiores que os anteriores
     * não substituam os que chegaram antes sendo então:
     * valor de linha [0] == 0 -> disponível.
     * valor de linha [0] == 1 -> indisponível.
     */
    Random rand = new Random();
    // gerar os pulos e verificar:
    public int salto(int sapo, int index){
        int num;
        num = geraNum();
        if(sapo < 20){
            sapo += num;
            System.out.println("O Sapo "+ (index+1) + " pulou: " + num + "m");
            if(sapo > 19){
                System.out.println("Sapo " + (index+1) + " chegou!");
                for (int i = 0; i < rank.length; i++) {
                    if (rank[i] == 0) {
                        rank[i] = index + 1;
                    }                    
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
    /* Classificar posição dos sapos:
    public void classifica(){
        for (int i = 0; i < rank.length; i++) {
            System.out.println(rank[i]);
        }
    }
    */
    
}