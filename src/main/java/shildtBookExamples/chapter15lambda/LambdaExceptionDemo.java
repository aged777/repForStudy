package shildtBookExamples.chapter15lambda;

// Сгенерировать исключение из лямбда-выражения

interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст");
    }
}
public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = { 1.0, 2.0, 3.0, 4.0 };

        // В этом лямбда-выражении вычисляется среднее
        // числовых значений типа double в массиве
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;

            if(n.length == 0) {
                throw new EmptyArrayException();
            }

            for(int i = 0; i < n.length; i++) {
                sum += n[i];
            }

            return sum / n.length;
        };

        System.out.println("Среднее равно " + average.func(values));

        // Эта строка приводит к генерированию исключения
        // System.out.println("Среднее равно " + average.func(new double[0]));

    }
}
