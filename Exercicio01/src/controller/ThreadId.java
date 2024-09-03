package controller;

public class ThreadId extends Thread{
    public ThreadId() {
        super();
    }

    @Override
    public void run(){
        int tid = (int) getId();
        System.out.println("Thread: " + tid);
    }
}
