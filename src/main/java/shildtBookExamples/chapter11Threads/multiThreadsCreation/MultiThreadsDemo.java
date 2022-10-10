package shildtBookExamples.chapter11Threads.multiThreadsCreation;

public class MultiThreadsDemo {
    public static void main(String[] args) {
        new NewThread("Один"); // запустить потоки на исполнение
        new NewThread("Два");
        new NewThread("Три");

        try {
            // ожидать завершения других потоков исполнения
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }

        System.out.println("Главный поток завершён.");
    }
}
