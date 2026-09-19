// we know even if use threads we cant perform the task siultaneously .because schedular handle it . like whom to give the priority to run or not. so we can only optimize it.we can use threadspriotiy and sleep method.
class A extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hiii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class threadsLec2 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();

    }
}
