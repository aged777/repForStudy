package shildtBookExamples.chapter12enumAutoboxingAnnotations;

public enum Apple2 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // цена яблока каждого сорта

    // Конструктор
    Apple2(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}
