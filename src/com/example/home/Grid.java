package com.example.home;
import java.util.*;

public class Grid {
     public static int dimension;

    public void setDimension () {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter dimension of the Grid (>=1): ");
        dimension = sc.nextInt();
    }
}
