package shildtBookExamples.chapter11Threads;
// Управление главным потоком исполнения
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток исполнения: " + t);
        // изменить имя потока исполнения
        t.setName("My Thread");
        System.out.println("После изменения имени потока: " + t);
        System.out.println("Имя потока, возвращаемое методом getName(): " + t.getName());

        try {
            for(int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
