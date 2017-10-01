package com.iandyli;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.
public class Main {

    public static void main(String[] args) {
        Couch myCouch = new Couch("leather", 3, true);
        Rug myRug = new Rug(3.5, 4.0, "wool");
        TV myTV = new TV("LG", "OLED65G7P", "OLED");

        Room myRoom = new Room(myCouch, myRug, myTV);

        myRoom.getMyTV().turnOn();
        myRoom.TVchangeCh(38);
        myRoom.measureRugArea();

    }
}
