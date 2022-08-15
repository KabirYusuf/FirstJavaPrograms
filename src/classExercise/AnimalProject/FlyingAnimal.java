package classExercise.AnimalProject;

import java.util.Objects;

public class FlyingAnimal extends Animal{
    private boolean haveFeather = false;
    private  String fly;


    public FlyingAnimal(String name, String colour, String age, String height, boolean haveFeather) {
        super(name, colour, age, height);
        this.haveFeather = haveFeather;
    }

    public boolean isHaveFeather(String haveFeather){
        if(Objects.equals(haveFeather,"yes")){
            this.haveFeather = true;
        }
        return false;
    }

    public String fly(){
        if(haveFeather){
            this.fly = "I am flying";
        }
        else {
            this.fly = "I cant fly";
        }

        return fly;
    }


    public void flying(){
        System.out.println("flying Animal.move() method called");
        move(5);
    }

//    @Override
//    public void move(int speed){
//        System.out.println("Flying animal movement");
//    }


    @Override
    public String toString(){
        return String.format("%s%nCan you fly: %s ",super.toString(),fly());
    }
}
