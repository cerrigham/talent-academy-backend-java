package it.bitrock.academy;

public class Operators {

    public static void main(String[] args) {
        // region math operations
        int aNumber = 2;
        int anotherNumber = 40;
        int sum = aNumber + anotherNumber;
        int multiplyInt = 2 * 3;
        int divideInt = 7 / 3;
        int remainderInt = 7 % 3;

        // TODO can you guess the results of the previous operations?

        int someInteger = 4;
        int someInteger2 = someInteger++;
        int someInteger3 = ++someInteger;
        // same for --

        // TODO which is the difference between the infix and postfix notation of ++?

        double aDoubleSum = 2.3 + 4.5;
        double divideDouble = 7.0 / 3;

        // TODO pay attention to floating point operations
        // endregion

        // region character operations
        char aLetter = 'a';
        aLetter++; // TODO which is the result of this operation?
        char aQuote = '\''; // quote chat needs to be escaped
        // endregion

        // region boolean operations
        boolean numberIsTooBig = aNumber > 100; // false
        boolean isLetterIsA = aLetter == 'A'; // pay attention to = and ==
        boolean smallOddNumber = (aNumber < 10) && (aNumber % 2 == 0);
        boolean negate = !smallOddNumber;
        // endregion
    }

}
