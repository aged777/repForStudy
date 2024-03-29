package shildtBookExamples.chapter15lambda;

// Продемонстрировать применение простого лямбда-выражения

// Функциональный интерфейс
interface MyNumber {
    double getValue();
}


public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;         // объявить ссылку на функциональный интерфейс

        // Здесь лямбда-выражение просто является константным выражением.
        // Когда оно присваивается ссылочной переменной myNum, получается
        // экземпляр класса, в котором лямбда-выражение реализует
        // метод getValue() из функционального интерфейса MyNumber
        myNum = () -> 123.45;

        // вызвать метод getValue(), предоставляемый присвоенным
        // ранее лямбда-выражением
        System.out.println("Фиксированное значение: " + myNum.getValue());

        // А здесь используется более сложное выражение
        myNum = () -> Math.random() * 100;

        // В следующих строках кода вызывается лямбда-выражение
        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Ещё одно случайное значение: " + myNum.getValue());

        // Лямбда-выражение должно быть совместимо по типу данных с абстрактным
        // методом, определяемым в функциональном интерфейсе.
        // Поэтому следующая строка кода ошибочна:
        // myNum = () -> "123.45";     // ОШИБКА!

    }
}
