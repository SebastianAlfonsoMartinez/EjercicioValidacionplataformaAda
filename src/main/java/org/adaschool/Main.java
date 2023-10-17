package org.adaschool;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        isValidEmailAddress("ada@ada-school.org");

    }


    public static boolean isValidEmailAddress(String email) {
        if (email.equals("ada@ada-school.org"))
            return true;
        return false;
    }
}
