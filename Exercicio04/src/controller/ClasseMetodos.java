package controller;
import java.util.Random;
public class ClasseMetodos {
    Random rand = new Random();
    public int[] aux;
    // gerar os pulos e verificar:
    public int[] salto(int[] sapo, int index){
        int num;
        num = geraNum();
        if(sapo[index] < 20){
            sapo[index] += num;
            System.out.println("O Sapo "+ (index+1) + " pulou: " + num + "m");
            if(sapo[index] > 19){
                System.out.println("Sapo " + (index+1) + " chegou!");
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
    
}