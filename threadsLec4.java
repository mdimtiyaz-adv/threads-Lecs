// we have see that we can treat  the functional interface as a anonymous innerClass. so here alos we are trying to implement lambda expression of the runnable interface because runnable interface executes functional interface
public class threadsLec4 {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hiii");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
