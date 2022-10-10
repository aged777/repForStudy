package shildtBookExamples.chapter14generics;

// Необобщённый класс может быть суперклассом
// для обобщённого подкласса

// Необобщённый класс
class NonGenHier2 {
    int num;

    NonGenHier2(int i) {
        num = i;
    }

    int gennum() {
        return num;
    }
}

// Обобщённый подкласс
class GenHier2<T> extends NonGenHier2 {
    T ob;           // объявить объект типа Т

    // передать конструктору объект типа Т
    GenHier2(T o, int i) {
        super(i);
        ob = o;
    }

    // возвратить объект ob
    T getOb() {
        return ob;
    }
}

// создать объект типа GenHier2
public class HierDemo2 {
    public static void main(String[] args) {
        // создать объект типа GenHier2
        // для символьных строк
        GenHier2<String> w = new GenHier2<String>("Добро пожаловать", 47);
        System.out.print(w.getOb() + " ");
        System.out.println(w.gennum());
    }
}
