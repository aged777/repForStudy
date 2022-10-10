package shildtBookExamples.chapter11Threads.multiThreadsCreation;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");

        System.out.println("The One Thead is alive: " + ob1.t.isAlive());
        System.out.println("The Two Thead is alive: " + ob2.t.isAlive());
        System.out.println("The Three Thead is alive: " + ob3.t.isAlive());

        // ожидать завершения потоков исполнения
        try {
            System.out.println("Waiting of Threads finishing.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("The main Thread is interrupted");
        }

        System.out.println("The One Thead is alive: " + ob1.t.isAlive());
        System.out.println("The Two Thead is alive: " + ob2.t.isAlive());
        System.out.println("The Three Thead is alive: " + ob3.t.isAlive());

        System.out.println("The main Thread is finished.");


    }
}
