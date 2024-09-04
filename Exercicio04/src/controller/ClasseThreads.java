package controller;
public class ClasseThreads extends Thread{
    ClasseMetodos met = new ClasseMetodos();
    // Criação de itens privados:
    private int[] sapo;
    private int[][] pod;
    // gerar contrutores:
    public ClasseThreads(int[] sapo, int[][] pod){
        this.sapo = sapo;
        this.pod = pod;
    }
    @Override
    public void run() {
        while (pod[0][4] == 0) {
            sapo = met.salto(sapo);
            pod = met.classifica(sapo, pod);   
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(
                (i + 1) + "º Sapo: " + pod[i]
            );           
        }
    }
}
