package com.zzxt.leetcode.q_1603;

import com.sun.org.apache.bcel.internal.generic.SWAP;

class ParkingSystem {

    int[] carPlace = new int[4];
    public ParkingSystem(int big, int medium, int small) {
        carPlace[1] = big;
        carPlace[2] = medium;
        carPlace[3] = small;
    }
    
    public boolean addCar(int carType) {
        if (carPlace[carType] > 0){
            carPlace[carType]--;
            return true;
        }

        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */