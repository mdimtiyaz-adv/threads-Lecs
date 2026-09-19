// there is another method of implementing thread . since thread implemets runnable interface.and runnable has run method we cant use start method we have to make threads and pass the runnable obj as argument.
class A implements Runnable {
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

class B implements Runnable {
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

public class threadLec3 {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }

}
