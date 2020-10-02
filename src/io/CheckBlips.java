package io;

import java.io.*;

public class CheckBlips {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Blip1 bl1 = new Blip1();
        Blip2 bl2 = new Blip2();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("CheckBlips.out"));
        out.writeObject(bl1);
        out.writeObject(bl2);
        out.flush();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("CheckBlips.out"));
        bl1 = (Blip1)in.readObject();
        bl2 = (Blip2)in.readObject();
    }
}
