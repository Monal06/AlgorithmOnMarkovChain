package com.example.home;
import java.util.HashMap;
public class Die extends Point{
    Grid grid = new Grid();
    int temp;
    public static int numberOfHops = 0;
    public HashMap<String, Integer> directions = new HashMap<String, Integer>() {{
        put("north", 0);
        put("south", 0);
        put("east", 0);
        put("west", 0);
    }};
    public void checkDirection(int randDirection){
        switch(randDirection){
            case 0: directions.put("north", directions.get("north")+1);
                toNorth(); //logic on moving north
                break;
            case 1 :  directions.put("south", directions.get("south")+1);
                toSouth(); //logic to move south
                break;
            case 2: directions.put("east", directions.get("east")+1);
                toEast(); //logic to move east
                break;
            case 3: directions.put("west", directions.get("west")+1);
                toWest(); //logic to move west
                break;
        }
    }
    public void toNorth(){
        temp = y;
        if(++temp > grid.dimension){
            System.out.println("Oops, hit the boundary: ("+x +" , "+temp+")");
        }else {
            y++;
            numberOfHops++;
            System.out.println("Hopped to: (" + x + " , " + y + ")");
        }
    }
    public void toSouth(){
        temp = y;
        if(--temp == -1){
            System.out.println("Oops, hit the boundary: ("+x +" , "+temp+")");
        }else{
            y--;
            numberOfHops++;
            System.out.println("Hopped to: ("+x +" , "+y+")");
        }

    }
    public void toEast(){
        temp = x;
        if(++temp > grid.dimension) {
            System.out.println("Oops, hit the boundary: (" + temp + " , " + y + ")");
        }else {
            x++;
            numberOfHops++;
            System.out.println("Hopped to: (" + x + " , " + y + ")");
        }
    }
    public void toWest(){
        temp = x;
        if(--temp == -1){
            System.out.println("Oops, hit the boundary: ("+temp +" , "+y+")");
        }
        else {
            x--;
            numberOfHops++;
            System.out.println("Hopped to: ("+x +" , "+y+")");
        }
    }
}
