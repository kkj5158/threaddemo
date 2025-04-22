package threadLab.thread;

import lombok.Getter;

@Getter
public class HelloThread extends Thread {
    public HelloThread(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("[Thread] 실행됨 - " + super.getName());
    }
}
