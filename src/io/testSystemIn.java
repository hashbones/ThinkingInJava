package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testSystemIn {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        System.out.println(s);
    }
}
