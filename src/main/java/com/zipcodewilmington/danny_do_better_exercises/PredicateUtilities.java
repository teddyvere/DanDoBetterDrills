package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Modified by kristofer 3/4/2024.
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public Boolean isGreaterThan(int x, int y) {
        boolean ans = x > y;
        return ans;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {
        boolean ans = x < y;
        return ans;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        boolean ans = x >= y;
        return ans;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {
        boolean ans = x <= y;
        return ans;
    }


    /**
     * @return true
     */
    public Boolean returnTrue() {
        Boolean isTrue = true;
        return isTrue;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        Boolean isFalse = false;
        return isFalse;
    }

}