package oca_studyGuide.part1.assessTest3;

public class Cougar {
    public static void main(String[] args) {
//        Puma puma = new Puma();
//        System.out.println(puma.getTailLength());
//        double amount = 14;
//        float d = 2.1f;
//        System.out.println(amount);
        String[] numbers = {"10", "9", "100", "8", "7"};
        java.util.Arrays.sort(numbers);
        for(String s : numbers) {
            System.out.println(s + " ");
        }
    }

    public int getTailLength(int length) {return 2;}
}
