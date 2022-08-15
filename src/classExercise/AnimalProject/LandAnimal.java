package classExercise.AnimalProject;

public class LandAnimal extends Animal{
    public LandAnimal(String name, String colour, String age, String height) {
        super(name, colour, age, height);
    }

    public void run(){
        System.out.println("I am running");
    }

    @Override
    public void move(int speed){
        System.out.println("Land animal movement");
    }

    @Override
    public String toString(){
        return String.format("%s%n",super.toString());
    }
}
