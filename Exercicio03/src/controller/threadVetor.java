package controller;
public class threadVetor extends Thread{
    private int num;
    private int[] vet;
    // Construtor:
    public threadVetor(int num, int[] vet){
        this.num = num;
        this.vet = vet;
    }
    // Método de calcTempo
    private void tempoVet(int[] vet, int num) {
        double tIni, tFim, tTotal;
        if((num % 2) == 0) { // Número par
            tIni = System.nanoTime();
            for (int i = 0; i < vet.length; i++) {}
            tFim = System.nanoTime();
        } else { // Ímpar
            tIni = System.nanoTime();
            for (@SuppressWarnings("unused") int i : vet){}
            tFim = System.nanoTime();
        }
        tTotal = tFim - tIni;
        tTotal = tTotal / Math.pow(10, 9);
        System.out.println("Tempo de execução: " + tTotal);
    }

    @Override
    public void run() {
        tempoVet(vet,num);
    }
}
