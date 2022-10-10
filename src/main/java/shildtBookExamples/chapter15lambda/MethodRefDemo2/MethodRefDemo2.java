package shildtBookExamples.chapter15lambda.MethodRefDemo2;

// Продемонстрировать применение ссылки на метод экземпляра

// Функциональный интерфейс для операций над символьными строками
interface StringFunc {
    String func(String n);
}

// Теперь в этом классе определяется
// метод экземпляра strReverse()
class MyStringOps {
    String strReverse(String str) {
        String result = "";
        int i;

        for(i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}
public class MethodRefDemo2 {

    // В этом методе функциональный интерфейс
    // указывается в качестве типа первого его
    // параметра. Следовательно, ему может быть
    // передан любой экземпляр этого интерфейса,
    // включая и ссылку на метод
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        // создать объект типа MyString Ops
        MyStringOps strOps = new MyStringOps();

        // А теперь ссылка на метод экземпляра strReverse()
        // передаётся методу stringOp()
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращённая строка: " + outStr);
    }
}
