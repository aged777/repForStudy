package shildtBookExamples.chapter11Threads.waitNotifyMethods.pcFixed;

public class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Для остановки нажмите Ctrl + C.");
    }
}
