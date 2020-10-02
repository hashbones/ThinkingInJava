package io;

import java.io.*;

public class Exercise27 implements Serializable {
    static SerializableClass sc = new SerializableClass();
    static SerializableClass sc2 = new SerializableClass("testName");
    transient String ss = "transient field";
    public Exercise27() {
        System.out.println("exercise27 constructor");
    };

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Exercise27 ex = new Exercise27();
        System.out.println("ss = " + ex.ss);
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("exercise27.out"));
        os.writeObject(ex);
        os.writeInt(123);
        os.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("exercise27.out"));
        ex = (Exercise27)ois.readObject();
        int i = ois.readInt();
        System.out.println(ex);
        System.out.println(i);
        System.out.println("ss = " + ex.ss);

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bout);
        oos.writeObject(ex);
        oos.writeBoolean(true);
        oos.flush();
        ObjectInputStream ois2 = new ObjectInputStream(new ByteArrayInputStream(bout.toByteArray()));
        Exercise27 ex2 = (Exercise27)ois2.readObject();
        boolean b = ois2.readBoolean();
        System.out.println(ex2);
        System.out.println(b);
    }
    public String toString() {
        return sc + "\n" + sc2;
    }
}
