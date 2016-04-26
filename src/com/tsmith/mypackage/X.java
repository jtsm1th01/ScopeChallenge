package com.tsmith.mypackage;

import java.util.Scanner;

/**
 * Created by travis on 4/23/16.
 */
public class X {

    private int x;

    public X(Scanner x) {
        System.out.println("Enter a number: ");
        this.x = x.nextInt();
    }

    public void x() {

        for (int x = 1; x <= 12; x++) {
            System.out.println(this.x + " x " + x + " = " + (this.x*x));
        }

    }

}
