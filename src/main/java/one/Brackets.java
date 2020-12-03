package one;

/**
    Если мы из корректно записанного арифметического выражения,
    содержащего числа, знаки операций и открывающие и закрывающие
    круглые скобки выбросим числа и знаки операций, а затем
    запишем оставшиеся в выражении скобки без пробелов между ними,
    то полученный результат назовем правильным скобочным выражением
    [скобочное выражение "(()(()))" - правильное, а "()(" и "())(" - нет].
    Найти число правильных скобочных выражений, содержащих N открывающихся
    и N закрывающихся скобок. N вводится с клавиатуры.
    N неотрицательное целое число.
 */

public class Brackets {
    private static final Character OPEN_BRACKET = '(';
    private static final Character CLOSE_BRACKET = ')';

    public int countAmount(String equation) {
        int openBrackets = 0;
        int amountBrackets = 0;
        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) == OPEN_BRACKET) {
                openBrackets++;
            }
            if (equation.charAt(i) == CLOSE_BRACKET && openBrackets != 0) {
                openBrackets--;
                amountBrackets++;
            }
        }
        return amountBrackets;
    }
}
