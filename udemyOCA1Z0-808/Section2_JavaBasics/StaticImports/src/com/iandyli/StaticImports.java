package com.iandyli;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static com.iandyli.Config.*;

public class StaticImports {
    public static void main(String[] args) {
        int min = min(1, 3);
        out.println(String.format("min = %d", min));
        out.println(PI);

        printConfig();
        out.println(String.format("name = %s", NAME));
        out.println(String.format("columnCount = %d", MAX_COLUMN_COUNT));
    }
}
