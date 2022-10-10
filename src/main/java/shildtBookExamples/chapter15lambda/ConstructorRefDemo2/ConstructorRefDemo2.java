package shildtBookExamples.chapter15lambda.ConstructorRefDemo2;

// Продемонстрировать применение ссылки на
// конструктор обобщённого класса

// Теперь функциональный интерфейс MyFunc
// объявляется как обобщённый
interface MyFunc<T> {
    MyClass<T> func(T n);
}

class MyClass<T> {
    private T val;

    // Этот конструктор принимает один аргумент
    MyClass(T v) {
        val = v;
    }

    // А это конструктор по умолчанию
    MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        // создать ссылку на конструктор обобщённого
        // класса MyClass<T>
        MyFunc<Integer> myClassCons = MyClass<Integer>::new;

        // создать экземпляр класса MyClass<T>
        // по данной ссылке на конструктор
        MyClass<Integer> mc = myClassCons.func(100);

        // воспользоваться только что созданным
        // экземпляром класса MyClass<T>
        System.out.println("Значение val в объектe mc равно " + mc.getVal());
    }
}
