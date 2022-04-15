package it.bitrock.academy;

public class Loops {

    public static void main(String[] args) {
        // region while loop
        int counter = 1;
        while (counter <= 10) {
            System.out.println("Counter is " + counter);
            counter++;
        }
        // endregion

        // region do-while loop
        int anotherCounter = 1;
        do {
            System.out.println("Another counter is " + anotherCounter);
            anotherCounter++;
        } while (anotherCounter <= 10);
        // endregion

        // TODO which is the main difference between while and do-while loop?

        // region for
        for (counter = 1; counter <= 10; counter++) {
            System.out.println("Counter is " + counter);
        }
        // endregion
    }

}
