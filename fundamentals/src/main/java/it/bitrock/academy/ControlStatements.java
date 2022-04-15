package it.bitrock.academy;

public class ControlStatements {

    public static void main(String[] args) {
        int age = 20;
        if (age < 18) {
            System.out.println("You cannot drive cars yet");
        } else {
            System.out.println("Pay attention while driving your car");
        }

        int temperature = 22;
        if (temperature < 20) {
            System.out.println("Quite chill outside, maybe take a jacket.");
        } else if (temperature < 25) {
            System.out.println("Very pleasant outside, take a walk.");
        } else {
            System.out.println("It's getting hot, maybe take some water.");
        }
    }

}
