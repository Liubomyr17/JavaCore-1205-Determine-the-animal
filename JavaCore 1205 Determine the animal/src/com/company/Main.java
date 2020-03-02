package com.company;

/*

1205 Determine the animal
Write a method that determines which class object was passed to him and returns the result - one value from: “Cow”, “Whale”, “Dog”, “Unknown animal”.
Requirements:
1. The program should display the text on the screen.
2. The Cow class cannot be changed.
3. The Dog class cannot be changed.
4. The Whale class cannot be changed.
5. The Pig class cannot be changed.
6. The getObjectType () method must return a single value from: “Cow”, “Whale”, “Dog”, “Unknown animal” depending on the transferred object. For example, "Cow" for objects of type Solution.Cow.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cow) {
            return "Корова";
        } else if (o instanceof Dog) {
            return "Собака";
        } else if (o instanceof Whale) {
            return "Кит";
        }


        return "Неизвестное животное";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
