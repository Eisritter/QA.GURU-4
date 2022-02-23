package guru.qa;

public class JavaOperators {

    //Примитивные типы данных
    byte aByte; // 8 bit -128 ... 127
    short aShort = 100 ; // 16 bit -32768 ... 32767
    int aInt = 1_100_000; // 32 bit -2 ^ 31 ... (2 ^ 31) -1  самый используемый
    long aLong = 100L; // 64 bit -2 ^ 63 ... (2 ^ 63) -1

    float aFloat = 0.0F; // 32 bit
    double aDouble = 0.0D; // 64 bit самый используемый тип не целых значений (для хранения, но не арифметики)

    char aChar = 'r';
    boolean aBoolean = false;

    // Ссылочный тип данных
    String aString = "hello, qa.guru!";

    public static void main(String[] args) {
        // + -- сложение
        // - -- вычитание
        // * -- умножение
        // / -- целочисленное деление
        // % -- остаток от деления
        // инкремент ++
        // декремент --

        // >
        // <
        // >=
        // <=
        // ==
        // !=

        // =
        // +=
        // -=...

        // && (&)
        // || (|)
        // !
        byte b = 3;
        int i = 10, r = 90;
        long l = 50_000_000_000L;

        // b = b + 127; переполнение типа byte
        // r = r - 999999999999999999999999999; переполнение типа int
        System.out.println((r + i) > (i - r)); // boolean
        System.out.println(r * i); //multiplication
        System.out.println(r / i); //division
        System.out.println(r % i); //remainder of division
        System.out.println(l + r); // long + int
        System.out.println(i += r); // assignment operator with arithmetic addition operator

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        System.out.println(b > i);
        System.out.println(r != i);

        float f = 0.5F;
        double d = 15.4444D;

        System.out.println(((f - d) > 0) && ((d - f) > 0));
        System.out.println(((f - d) > 0) || ((d - f) > 0));
        System.out.println(d / f);
        System.out.println(d % f);

        char x = 'e', y = 'a';
        boolean booleanValue = false;

        System.out.println(x + y); // char + char
        System.out.println(!booleanValue);
    }
}
