package org.fasttrackit.tema12.ExtraMile;

import java.util.ArrayList;
import java.util.List;

public class Range{

    private int minKm;

    private int maxKm;

    public Range(int minKm, int maxKm) {
        this.minKm = minKm;
        this.maxKm = maxKm;
    }


    public int getMinKm() {
        return this.minKm;
    }

    public int getMaxKm() {
        return this.maxKm;
    }

    @Override
    public String toString() {
        return minKm + " to " + maxKm + " km ";
    }

}
