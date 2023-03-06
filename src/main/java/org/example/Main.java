package org.example;

import org.example.Appliction.AppController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new AppController(new Scanner(System.in)).run();
    }
}