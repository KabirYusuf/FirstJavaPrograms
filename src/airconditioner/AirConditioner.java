package airconditioner;

public class AirConditioner {
   private boolean isOn;
   private boolean isOff;

   private int temperature = 16;


    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean getOn() {
        return isOn;
    }


    public void setOff(boolean off) {
        isOff = off;
    }

    public boolean getOff() {
        return isOff;
    }

    public void increaseTemperature(){
        temperature = temperature + 1;
    }
    public void setTemperatureBeyondThirty(){
        if(temperature > 30){
            temperature = 30;
        }
    }
    public void decreaseTemperature() {
        temperature = temperature - 1;
    }

    public void setTemperatureBelowSixteen(){
        if(temperature < 16){
            temperature = 16;
        }
    }

    public int getTemperature() {
        return temperature;
    }
}

