package shildtBookExamples.chapter11Threads.newTreadextThread;
// создание нового потока исполнения путём расширения класса Thread
public class NewThread extends Thread {
    // создать новый поток исполнения
    NewThread() {
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start(); // запустить поток на выполнение
    }

    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершён.");
    }
}
