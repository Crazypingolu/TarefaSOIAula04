package view;
import controller.ThreadId;
public class ClassePrincipal {
    public static void main(String[] args) {
        for(int c = 0; c < 5; c++){
            ThreadId t = new ThreadId();
            t.start();
        }
    }
}
