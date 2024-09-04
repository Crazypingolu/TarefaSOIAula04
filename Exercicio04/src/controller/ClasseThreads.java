package controller;
public class ClasseThreads extends Thread{
    ClasseMetodos met = new ClasseMetodos();
    // Criação de itens privados:
    private int[] sapo;
    private int index;
    // gerar contrutores:
    public ClasseThreads(int[] sapo, int index){
        this.sapo = sapo;
        this.index = index;
    }
    @Override
    public void run() {
        while (true) {
            sapo = met.salto(sapo, index);
            if (sapo[index] > 19) {
                break;
            }
        }
    }
}
