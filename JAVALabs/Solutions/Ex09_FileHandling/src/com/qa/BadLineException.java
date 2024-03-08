package com.qa;
// Ex3 Task2-1
public class BadLineException extends Exception{
    private String textLine;

    public BadLineException(String message, String textLine) {
        super(message);
        this.textLine = textLine;
    }

    public String getTextLine() {
        return textLine;
    }
}
