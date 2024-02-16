package ru.gb.oop.dz_task_4;

/**
 * 1)расширить класс калькулятор на умножение
 * 2)расширить класс калькулятор на деление
 * 3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг,
 *  так и инт - тут необходимо подумать как наилучшим образом реализовать,
 *  что будет если будут приниматься округляемые Double/Float
 *  (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
 */


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(4, 56, 64, 32);
        System.out.println(STR."sum() = \{calculator.sum()}");
        System.out.println(STR."multiply() = \{calculator.multiply()}");
        System.out.printf("division(4, 56) = %.2f", calculator.division(4, 56));
        System.out.println(STR."\nconversionToBin(4) = \{calculator.conversionToBin(4)}");
        System.out.println(STR."conversionToDecimal(\"56\") = \{calculator.conversionToDecimal("56")}");
    }
}
