package dev.mcabsan.hello;

public class Messenger {
    private String message = "Hello world!";

    public Messenger() {}

    public Messenger(String message) {
        this.message = message;
    }

    public String say() {
        return message;
    }
}
