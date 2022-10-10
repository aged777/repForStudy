package shildtBookExamples.chapter15lambda.GenericMethRefDemo;

// Продемонстрировать применение ссылки на обобщённый
// метод, объявленный в необобщённом классе

// Функциональный интерфейс для обработки массива
// значений и возврата целочисленного результата
interface MyFunc<T> {
    int func(T[] vals, T v);
}

// В этом классе определяется метод countMatching(),
// возвращающий количество элементов в массиве,
// равных указанному значению. Обратите внимание на то,
// что метод countMatching() является обобщённым,
// тогда как класс MyArrayOps - необобщённым
class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;

        for(int i = 0; i < vals.length; i++) {
            if(vals[i] == v) {
                count++;
            }
        }

        return count;
    }
}

public class GenericMethRefDemo {
    // В качестве первого параметра этого метода
    // указывается функциональный интерфейс MyFunc,
    // а в качестве двух других параметров - массив и
    // значение, причём оба типа T
    static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 5 };
        String[] strs = { "Один", "Два", "Три", "Два"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Массив vals содержит " + count + " числа четыре");

        count = myOp(MyArrayOps::<String>countMatching, strs, "Два");
        System.out.println("Массив strs содержим " + count + " числа два");
    }
}
