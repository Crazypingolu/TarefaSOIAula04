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
        sapo = met.salto(sapo);
        pod = met.classifica(sapo, pod);
    }
}
