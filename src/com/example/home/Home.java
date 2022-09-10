package com.example.home;
import java.lang.Math;
public class Home {
    public static void main(String [] args) {
        Kangaroo skippy = new Kangaroo();
        skippy.startGridHopping();
    }
    public int randomDirection(){
        int randDirection = (int)(Math.random() * 4);
        return randDirection;
    }
}
