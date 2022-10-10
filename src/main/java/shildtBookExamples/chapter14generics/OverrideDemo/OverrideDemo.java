package shildtBookExamples.chapter14generics.OverrideDemo;

// Переопределение метода в обобщённом классе
class Gen<T> {
    T ob;           // объявить объект типа T

    // передать конструктору ссылку на объект типа T
    Gen(T o) {
        ob = o;
    }

    // возвратить объект ob
    T getob() {
        System.out.print("Метод getob() из класса Gen: ");
        return ob;
    }
}

// Подкласс, производный от класса Gen и
// переопределяющий метод getob()
class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }

    // переопределить метод getob()
    T getob() {
        System.out.print("Метод getob() из класса Gen2: ");
        return ob;
    }
}

// продемонстрировать переопределение обобщённых методов
public class OverrideDemo {
    public static void main(String[] args) {
        // создать объект типа Gen для целых чисел
        Gen<Integer> iOb = new Gen<Integer>(88);

        // создать объект типа Gen2 для целых чисел
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        // создать объект типа Gen2 для символьных строк
        Gen2<String> strOb2 = new Gen2<String>("Тест обобщений");
        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}
