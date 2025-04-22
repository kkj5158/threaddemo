package threadLab.thread;

public class HelloRunnable implements Runnable {

    private final String name;

     public HelloRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("[Runnable] 실행됨 - " + name);
    }
}
