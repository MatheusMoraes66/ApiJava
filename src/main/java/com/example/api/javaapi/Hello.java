package com.example.api.javaapi;

public class Hello {

    private String message;
    private String name;

    public Hello(String message, String name) {
        this.message = message;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "message='" + message + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
