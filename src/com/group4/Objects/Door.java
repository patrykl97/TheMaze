package com.group4.Objects;


import com.group4.Interfaces.MapSite;

public class Door implements MapSite {

    private static int doorCnt = 1;
    private int doorNr;
    private Room room1;
    private Room room2;


    public Door() {

    }

    public Door(Room r){
        doorNr = doorCnt++;
//        System.out.println("creating a Door #" + _doorNr + " between " + r1 + " and " + r2);
        room1 = r;
//        _room2 = r2;
    }

    public void setRooms(Room r1, Room r2) {
        room1 = r1;
        room2 = r2;
    }

    public void setSecondRoom(Room r) {
        room2 = r;
    }

    @Override
    public String toString(){
        return "Door #" + doorNr;
    }

    public Room getRoom1() {
        return room1;
    }

    public Room getRoom2() {
        return room2;
    }
}