// we have seen that primitive values are mutable . means it can be changed. but the strings are immutable.here we learn about that how can we use thread in mutable value.
class Score {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class ThreadsLec5 {
    public static void main(String[] args) throws InterruptedException {
        Score sc = new Score();
        Runnable obj1 = () -> {
            for (int i = 1; i < 1000; i++) {
                sc.increment();

            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i < 1000; i++) {
                sc.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sc.count);
    }
}
