package com.example.home;

public class Kangaroo extends Home{
    public void startGridHopping() {
        Grid grid = new Grid();
        grid.setDimension();

        //to find N<S<E<W randomly
        Point point = new Point();
        Die die = new Die();
        int numberOfThrows = 0;

        while (point.x != grid.dimension || point.y != grid.dimension) {
            int randDirection = randomDirection();
            numberOfThrows++;
            //find which direction it is and execute the operation
            die.checkDirection(randDirection);
        }
        System.out.println("Finished in" + ' ' + +die.numberOfHops +' ' + "hops!");
        System.out.println("Die statistics:");
        System.out.println("Total throws:: " + numberOfThrows);
        float north, south, east, west;

        north = (die.directions.get("north") * 100 / numberOfThrows);
        south = (die.directions.get("south") * 100 / numberOfThrows);
        east = (die.directions.get("east") * 100 / numberOfThrows);
        west = (die.directions.get("west") * 100 / numberOfThrows);

        System.out.println("North: " + north + "% South: " + south + "%  East: " + east + "% West: " + west + '%');
    }
}
