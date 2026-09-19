// threads:lets say we want to perfom an operation 2+2 in our software. basically our software runs on os and below os there is hardware which has cpu ram etc. sw said to os and os send it to cpu and cpu will handle it. but when we have large problem or multiple problems , the cpu divides the work in pieces and perform it simultaneously and there is small units called thread which use rsources. so in java to perform multiple task simultaneously we use threads.threads depend on core of cpu and schedulars
class A extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hello");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hiii");

        }
    }
}

public class threadsInJava {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();

    }
}
