package Develhope_Ex.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public enum Operazioni {
        ADDIZIONE,
        SOTTRAZIONE,
        MOLTIPLICAZIONE,
        DIVISIONE,
        MIN,
        MAX
    }
    public static void main(String[] args) {

        System.out.println(OperazioniBig(BigDecimal.valueOf(1), BigDecimal.valueOf(1), Operazioni.ADDIZIONE));
        System.out.println(OperazioniBig(BigDecimal.valueOf(2), BigDecimal.valueOf(1), Operazioni.SOTTRAZIONE));
        System.out.println(OperazioniBig(BigDecimal.valueOf(5), BigDecimal.valueOf(2), Operazioni.MOLTIPLICAZIONE));
        System.out.println(OperazioniBig(BigDecimal.valueOf(10), BigDecimal.valueOf(2), Operazioni.DIVISIONE));




    }

    public static BigDecimal OperazioniBig (BigDecimal num1, BigDecimal num2, Operazioni operazioni) {
        BigDecimal res = BigDecimal.ZERO;

        System.out.println(num1 + ", " + num2 + ", " + operazioni);


        switch (operazioni) {
            case ADDIZIONE -> {
                res = num1.add(num2);
                break;
            }

            case SOTTRAZIONE -> {
                res = num1.subtract(num2);
                break;
            }
            case MOLTIPLICAZIONE -> {
                res = num1.multiply(num2);
                break;
            }
            case DIVISIONE -> {
                if(num1.compareTo(BigDecimal.ZERO) == 0 || num2.compareTo(BigDecimal.ZERO) == 0) {
                    return res;
                }
                res = num1.divide(num2, RoundingMode.CEILING);
                break;
            }

        }
        return res;
    }
}
