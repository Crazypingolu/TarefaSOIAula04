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
        int flag = 0;
        while (flag != 1) {
            sapo = met.salto(sapo);
            if (sapo[0] > 19 && sapo[1] > 19 && sapo[2] > 19 && sapo[3] > 19 && sapo[4] > 19) {
                flag = 1;
            }
        }
    }
}
