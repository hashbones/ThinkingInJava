package io;

import java.io.*;

public class Blip3 implements Externalizable {
    int i;
    String s;
    transient String ss;
    public Blip3(int i, String s) {
        this.i = i;
        this.s = s;
        System.out.println("Constructor with params");
        System.out.println("i = " + i);
        System.out.println("s = " + s);
    }
    public Blip3() {
        System.out.println("Constructor without params");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("readExternal");
        i = in.readInt();
        s = (String)in.readObject();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("writeExternal");
        out.writeInt(i);
        out.writeObject(s);
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Blip3 bl = new Blip3(666, "hey hey");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Blip3.out"));
        out.writeObject(bl);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Blip3.out"));
        Blip3 bl2 = (Blip3)in.readObject();
        System.out.println(bl2.i);
        System.out.println(bl2.s);
    }
}
