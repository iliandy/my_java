package com.iandyli;

public class Printer {
    private double tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean duplexPrinting = true;

    // constructor with default parameters
    public Printer() {}

    // constructor with entered parameters
    public Printer(double tonerLevel, int pagesPrinted, boolean duplexPrinting) {
        if (0 <= tonerLevel && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }

        this.pagesPrinted = pagesPrinted;
        this.duplexPrinting = duplexPrinting;
    }

    public Printer refillToner() {
        this.tonerLevel = 100;
        return this;
    }

    public Printer printPage(int numPages) {
        this.tonerLevel -= 0.01;
        this.pagesPrinted += numPages;
        return this;
    }

    public double getTonerLevel() {
        System.out.println(String.format("Toner level: %.2f.", tonerLevel));
        return tonerLevel;
    }

    public int getPagesPrinted() {
        System.out.println(String.format("Pages printed: %d.", pagesPrinted));
        return pagesPrinted;
    }

    public boolean isDuplexPrinting() {
        return duplexPrinting;
    }
}
