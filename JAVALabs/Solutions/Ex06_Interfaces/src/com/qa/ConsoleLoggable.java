package com.qa;

public interface ConsoleLoggable extends Loggable{
    public default void log(String msg) {
        System.out.println("Console> " + msg);
    }
}
