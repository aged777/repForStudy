package shildtBookExamples.chapter15lambda.ConstructorRefDemo;

// Продемонстрировать применение ссылки на конструктор

// В функциональном интерфейсе MyFunc определяется
// метод, возвращающий ссылку на класс MyClass
interface MyFunc {
    MyClass func(int n);
}

class MyClass {
    private int val;

    // Этот конструктор принимает один аргумент
    MyClass(int v) {
        val = v;
    }

    // А это конструктор по умолчанию
    MyClass() {
        val = 0;
    }

    int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор класса MyClass.
        // Метод func() из интерфейса MyFunc принимает
        // аргумент, поэтому в операции new вызывается
        // параметризованный конструктор класса MyClass,
        // а не его конструктор по умолчанию
        MyFunc myClassCons = MyClass::new;

        // создать экземпляр класса MyClass
        // по ссылке на его конструктор
        MyClass mc = myClassCons.func(100);

        // использовать только что созданный экземпляр
        // класса MyClass
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
