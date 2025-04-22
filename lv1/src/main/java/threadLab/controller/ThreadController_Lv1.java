package threadLab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import threadLab.thread.HelloRunnable;
import threadLab.thread.HelloThread;

@RestController
@RequestMapping("/test")
public class ThreadController_Lv1 {

    @GetMapping("/threads")
    public String thread_test() {

        HelloThread thread1 = new HelloThread("t1");
        HelloThread thread2 = new HelloThread("t2");
        HelloThread thread3 = new HelloThread("t3");
        HelloThread thread4 = new HelloThread("t4");
        HelloThread thread5 = new HelloThread("t5");
        HelloThread thread6 = new HelloThread("t6");
        HelloThread thread7 = new HelloThread("t7");
        HelloThread thread8 = new HelloThread("t8");
        HelloThread thread9 = new HelloThread("t9");
        HelloThread thread10 = new HelloThread("t10");

        Runnable r1 = new HelloRunnable("r_t1");
        Runnable r2 = new HelloRunnable("r_t2");
        Runnable r3 = new HelloRunnable("r_t3");
        Runnable r4 = new HelloRunnable("r_t4");
        Runnable r5 = new HelloRunnable("r_t5");
        Runnable r6 = new HelloRunnable("r_t6");
        Runnable r7 = new HelloRunnable("r_t7");
        Runnable r8 = new HelloRunnable("r_t8");
        Runnable r9 = new HelloRunnable("r_t9");
        Runnable r10 = new HelloRunnable("r_t10");


//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();
//        thread7.start();
//        thread8.start();
//        thread9.start();
//        thread10.start();

        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
        new Thread(r4).start();
        new Thread(r5).start();
        new Thread(r6).start();
        new Thread(r7).start();
        new Thread(r8).start();
        new Thread(r9).start();
        new Thread(r10).start();

        return null;

    }
}
