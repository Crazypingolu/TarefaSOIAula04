package controller;

public class Threads extends Thread{
    private int[] veT = new int[5];
    public Threads(int[] veT){
        this.veT = veT;
    }

    @Override
    public void run() {
        calculo();
    }

    private void calculo(){
        int tam = veT.length;
        int soma = 0;
        for (int i = 0; i < tam; i++) {
            soma += veT[i];
        }
        System.out.println("Soma da linha: " + soma);
    }
}
