package org.zeta.experiments.select;

import it.unimi.dsi.bits.BitVector;
import it.unimi.dsi.bits.LongArrayBitVector;
import it.unimi.dsi.sux4j.bits.Rank9;
import it.unimi.dsi.sux4j.bits.Select9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BitVector bitVector = LongArrayBitVector.getInstance();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            final long offset = Long.parseLong(line);
            bitVector.set(offset);
        }
        bufferedReader.close();
        Rank9 rank = new Rank9(bitVector);
        final Select9 select = new Select9(rank);

        rank = null;
        bitVector = null;
        bufferedReader = null;
    }

}
