package shildtBookExamples.chapter14generics;

// Подкласс, производный от класса Gen, где
// определяется второй параметр типа V
class Gen2<T, V> extends Gen<T> {
    V ob2;

    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    // возвратить объект o2
    V getob2() {
        return ob2;
    }
}

// создать объект типа Gen2
public class HierDemo {
    public static void main(String[] args) {

        // создать объекты типа Gen2 для
        // символьных строк и целых чисел
        Gen2<String, Integer> x = new Gen2<>("Значение равно: ", 99);

        System.out.print(x.getob());
        System.out.println(x.getob2());
    }
}
