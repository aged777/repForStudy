package shildtBookExamples.chapter14generics.HierDemo3;

// Сравнение типов в обобщённой
// иерархии во время выполнения

// Использовать оператор instanceof
// в иерархии обобщённых классов
class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    // возвратить объект ob
    T getob() {
        return ob;
    }
}

// Подкласс, производный от класса Gen
class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }
}

// продемонстрировать последвтвия динамической
// идентификации типов в иерархии обобщённых классов
class HierDemo3 {
    public static void main(String[] args) {
        // создать объект типа Gen для целых чисел
        Gen<Integer> iOb = new Gen<Integer>(88);

        // создать объект типа Gen2 для целых чисел
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        // создать объект типа Gen2 для символьных строк
        Gen2<String> strOb2 = new Gen2<String>("Тест обобщений");

        // проверить, является ли объект iOb2 какой-нибудь
        // из форм класса Gen2
        if(iOb2 instanceof Gen2<?>) {
            System.out.println("Объект iOb2 является экземпляром класса Gen2");
        }

        // проверить, является ли объект iOb2 какой-нибудь
        // из форм класса Gen
        if(iOb2 instanceof Gen<?>) {
            System.out.println("Объект iOb2 является экземпляром класса Gen");
        }
        System.out.println();

        // проверить, является ли объект strOb2 какой-нибудь
        // из форм класса Gen2
        if(strOb2 instanceof Gen2<?>) {
            System.out.println("Объект strOb2 является экземпляром класса Gen2");
        }

        // проверить, является ли объект strOb2 какой-нибудь
        // из форм класса Gen
        if(strOb2 instanceof Gen<?>) {
            System.out.println("Объект strOb2 является экземпляром класса Gen");
        }
        System.out.println();

        // проверить, является ли объект iOb какой-нибудь
        // из форм класса Gen2
        if(iOb instanceof Gen2<?>) {
            System.out.println("Объект iOb2 является экземпляром класса Gen2");
        }

        // проверить, является ли объект iOb какой-нибудь
        // из форм класса Gen
        if(iOb instanceof Gen<?>) {
            System.out.println("Объект iOb является экземпляром класса Gen");
        }

//        Следующий код не скомпилируется, так как
//        сведения об обобщённом типе отсутствуют во время выполнения
        if(iOb2 instanceof Gen2<Integer>) {
            System.out.println("Объект iOb2 является экземпляром класса Gen2<Integer>");
        }
    }
}

