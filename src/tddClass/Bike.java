package tddClass;

public class Bike {
    private boolean isOn;
    private boolean isOff;
    private int gear = 0;
    private int speed = -1;

    public void setOn(boolean on){
        isOn = on;
    }
    public boolean getOn(){
        return isOn;
    }
    public void setOff(boolean off){
        isOff = off;
    }
    public boolean getOff(){
        return isOff;
    }
    public void increaseGear() {
        gear = gear + 1;
        if(gear > 4) {
            gear = 4;
        }
    }
    public void decreaseGear() {
        gear = gear - 1;
        if(gear < 0){
            gear = 0;
        }
    }
    public void gearBelowZero(){
        if(gear < 0){
            gear = 0;
        }
    }
    public void gearBeyondFour(){
        if(gear > 4) {
            gear = 4;
        }
    }
    public int getGear() {
        return gear;

    }

    public int accelerate(){
        if(gear == 1) {
            speed = speed + 1;
            if(speed > 20 && gear == 1){
                speed = 20;
            }
        }
        else if (gear == 2) {
            speed = speed + 2;
        }
        else if (gear == 3) {
            speed = speed + 3;
        }
        else if (gear == 4) {
            speed = speed + 4;
        }
        else{
            speed = 0;
        }
        return speed;
    }
    
//    public int setSpeed(){
//        if(speed >= 0 && speed <= 20){
//            gear = 1;
//        }
//        else if (speed > 20 && speed <= 30) {
//            gear = 2;
//        }
//        else if (speed > 30 && speed <= 40) {
//            gear = 3;
//        }
//        else if (speed > 40) {
//            gear = 4;
//        }
//        else{
//            gear = 0;
//        }
//        return speed;
//    }


    }


