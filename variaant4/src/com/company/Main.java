package com.company;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) {


        Basov[] basov = new Basov[5];
        for (Basov bas : basov) {
            if (bas instanceof Intr) {
                ((Intr) bas).Read(basov, basov.length);
            }
            if (bas instanceof Abs) {
                ((Abs) bas).Iskatel(basov, basov.length);
            }
            Arrays.sort(basov, Comparator.comparing((Basov::getName)));


        }
    }
}


