package com.mariuspurici.lab2;

// Singleton Pattern
public class GreenLogger {
    private static GreenLogger instance;

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";

    private GreenLogger() {
        System.out.println("A GreenLogger object has been created!!!");
    }

    public static GreenLogger getInstance() {
        if (GreenLogger.instance == null) {
            instance = new GreenLogger();
        }
        return GreenLogger.instance;
    }

    public void log(String text) {
        System.out.println(ANSI_GREEN + text + ANSI_RESET);
    }
}
