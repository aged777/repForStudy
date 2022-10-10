package shildtBookExamples.chapter15lambda;

// продемонстрировать применение лямбда-выражения,
// принимающего один параметр

// Ещё один функциональный интерфейс
interface NumericTest {
    boolean test(int n);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        // Лямбда-выражение, в котором проверяется,
        // является ли число чётным
        NumericTest isEven = n -> (n % 2) == 0;

        if(isEven.test(10))
            System.out.println("Число 10 чётное");
        if(!isEven.test(9))
            System.out.println("Число 9 нечётное");

        // А теперь воспользоваться лямбда-выражением,
        // в котором проверяется, является ли число
        // неотрицательным
        NumericTest isNonNeg = (n) -> n >= 0;

        if(isNonNeg.test(1))
            System.out.println("Число 1 неотрицательное");
        if(!isNonNeg.test(-1))
            System.out.println("Число -1 отрицательное");
    }
}
