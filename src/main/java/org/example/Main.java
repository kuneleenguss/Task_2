//package org.example;
package org.example;

import org.example.Birds.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Drozd drozd = new Drozd();
        Straus straus = new Straus();

        System.out.println(drozd.getColor());
        System.out.println(straus.getColor());
    }
}