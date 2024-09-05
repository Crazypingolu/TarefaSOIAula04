package view;
import controller.ClasseThreads;
public class ClasseMain {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            ClasseThreads t = new ClasseThreads(i);
            t.start();
        }
    }
}
