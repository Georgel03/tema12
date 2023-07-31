package org.fasttrackit.tema12.ExtraMile;

public class PriceRange {

    private int minCash;

    private int maxCash;

    public PriceRange(int minCash, int maxCash) {
        this.minCash = minCash;
        this.maxCash = maxCash;
    }


    public int getMinCash() {
        return this.minCash;
    }

    public int getMaxCash() {
        return this.maxCash;
    }

    @Override
    public String toString() {
        return minCash + " to " + maxCash + " $ ";
    }

}

