package shildtBookExamples.chapter12enumAutoboxingAnnotations;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple2 ap;

        // вывести цену на яблоко сорта Winesap
        System.out.println("Яблоко сорта Winesap стоит " + Apple2.Winesap.getPrice() + " центов.\n");

        // вывести цены на все сорта яблок
        System.out.println("Цены на все сорта яблок: ");
        for (Apple2 a:Apple2.values()
             ) {
            System.out.println(a + " стоит " + a.getPrice() + " центов.");

        }
    }
}
