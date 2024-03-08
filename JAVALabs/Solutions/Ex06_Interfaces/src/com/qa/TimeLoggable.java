package com.qa;

import java.time.LocalDateTime;

public interface TimeLoggable extends Loggable{
    public default void log(String msg) {
        System.out.println(LocalDateTime.now() + "> " + msg);
    }
}
