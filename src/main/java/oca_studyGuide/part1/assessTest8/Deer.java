package oca_studyGuide.part1.assessTest8;

public class Deer {
    public Deer() {
        System.out.println("Deer");
    }

    public Deer(int age) {
        System.out.println("DeerAge");
    }

    boolean hasHorns() {return false;}

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());
    }
}
