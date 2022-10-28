package classExercise.turtle;

import classExercise.turtle.Pen;

public class Turtle {
    private Pen turtlePen;
    private int xCoordinate;
    private int yCoordinate;

    public Turtle(){
        turtlePen = new Pen();
    }

    public Turtle(Pen pen){
        turtlePen = pen;
    }

    public void moveForward(int numberOfSteps){
        xCoordinate = numberOfSteps - 1;
    }

    public Pen getTurtlePen() {
        return turtlePen;
    }

    public void setTurtlePen(Pen turtlePen) {
        this.turtlePen = turtlePen;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
