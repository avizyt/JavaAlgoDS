package com.avijit;

public class Computer {
    // variables
    private double cpuSpeed;

    // constructor
    Computer() {
        cpuSpeed = 0;
    }

    //methods
    void setCpuSpeed( double _cpuSpeed){
        cpuSpeed = _cpuSpeed;
    }
    double getCpSpeed(){
        return cpuSpeed;
    }
    public static void main(String[] args) {

    }
}
