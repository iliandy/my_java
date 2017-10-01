package com.iandyli;

public class Room {
    private Couch myCouch;
    private Rug myRug;
    private TV myTV;

    public Room(Couch myCouch, Rug myRug, TV myTV) {
        this.myCouch = myCouch;
        this.myRug = myRug;
        this.myTV = myTV;
    }

    public Couch getMyCouch() {
        return myCouch;
    }

    public Rug getMyRug() {
        return myRug;
    }

    public TV getMyTV() {
        return myTV;
    }

    public void TVchangeCh(int channel) {
        myTV.changeCh(channel);
    }

    public double measureRugArea() {
        return myRug.getArea();
    }
}
