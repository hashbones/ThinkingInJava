package io;

import java.io.Serializable;

public class SerializableClass implements Serializable {
    String name = "empty";
    public SerializableClass() {
        System.out.println("SerializableClass constructor");
    }
    public SerializableClass(String name) {
        System.out.println("SerializableClass constructor");
        this.name = name;
    }

    public String toString() {
        return "it's a SerializableClass with name = " + name;
    }
}
