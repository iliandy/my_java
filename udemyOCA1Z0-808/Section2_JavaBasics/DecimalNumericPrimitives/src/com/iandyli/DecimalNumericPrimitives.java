package com.iandyli;

public class DecimalNumericPrimitives {
    public static void main(String[] args) {
        float myNum = 25.4F;

//        double before = 10_.25; // does not compile
//        double after = 10._25;  // does not compile
//        double first = _10.25;  // does not compile
//        double last = 10.25_;   // does not compile

        double myDouble = 2.54;
        double myDouble2 = 2.54F;   // F unneeded and number will be converted to double regardless
        double myDouble3 = 2.45D;   // D can be used for double, optional

        double scientific = 5.000125E03;
        double scientific2 = 5.000125E3;
        double scientific3 = 5000.125;

        System.out.println("scientific = " + scientific);
        System.out.println("scientific2 = " + scientific2);
        System.out.println("scientific3 = " + scientific3);

        double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number
        System.out.println("hexPi = " + hexPi);
    }
}
