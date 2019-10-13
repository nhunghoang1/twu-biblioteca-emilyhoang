package com.twu.biblioteca;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");

        Menu menu = new Menu();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int line = 9;
        while (line != 0)
        try {
            menu.printOptions();
            line = Integer.parseInt(reader.readLine());

            menu.chooseOptions(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
