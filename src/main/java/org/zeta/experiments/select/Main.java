package org.zeta.experiments.select;

import it.unimi.dsi.fastutil.longs.LongBigArrayBigList;
import it.unimi.dsi.fastutil.longs.LongBigList;
import it.unimi.dsi.sux4j.bits.SparseSelect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    private static final int Gb = 1024 * 1024 * 1024;

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        LongBigList offsetsList = new LongBigArrayBigList();
        String line;
        System.out.print("? ");
        while ((line = bufferedReader.readLine()) != null) {
            final long offset = Long.parseLong(line);
            offsetsList.add(offset);
            System.out.print("? ");
        }
        bufferedReader.close();
        final SparseSelect offsets = new SparseSelect(offsetsList);
        offsetsList.clear();
        offsetsList = null;
        bufferedReader = null;
        final Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        System.out.printf("Used Memory %dGb\n", (runtime.totalMemory() - runtime.freeMemory()) / Gb);
        System.out.println(offsets.select(3));
    }

}
