package com.iandyli;

public class WholeNumericPrimitives {
	public static void main(String[] args) {
		long max = 32_123_456_789L;
		long n = 2_300;

		// octal (0 - 7)
		int oct = 07;
		int firstOct = 010;		// 8 decimal
		int secondOct = 022;	// 18 decimal
		int sumOct = firstOct + secondOct;	// 26 decimal, 32 octal

		System.out.println(String.format("first = %d, second = %d", firstOct, secondOct));
		System.out.println(String.format("decimal sum = %d, octal sum = %s", sumOct, Integer.toOctalString(sumOct)));

		// hexadecimal (0 - 9, A - F)
		int firstHex = 0xF;		// 15 decimal
		int secondHex = 0x1E;	// 30 decimal
		int sumHex = firstHex + secondHex;	// 45 decimal, 2d hexadecimal

		System.out.println(String.format("first = %d, second = %d", firstHex, secondHex));
		System.out.println(String.format("decimal sum = %d, hexidecimal sum = %s", sumHex, Integer.toHexString(sumHex)));

		// binary (0 - 1)
		int firstBin = 0b1001;	// 9 decimal
		int secondBin = 0b0111; // 7 decimal
//		int thirdBin = 0b02;
		int sumBin = firstBin + secondBin;	// 16 decimal, 10000 binary

		System.out.println(String.format("first = %d, second = %d", firstBin, secondBin));
		System.out.println(String.format("decimal sum = %d, binary sum = %s", sumBin, Integer.toBinaryString(sumBin)));
	}

}
