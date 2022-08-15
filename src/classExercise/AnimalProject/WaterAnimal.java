package classExercise.AnimalProject;

public class WaterAnimal extends Animal{
    public WaterAnimal(String name, String colour, String age, String height) {
        super(name, colour, age, height);
    }
    public String swim(){
        return String.format("I can swim");
    }

    @Override
    public void move(int speed){
        System.out.println("Water animal movement");
    }

    @Override
    public String toString(){
        return String.format("%s%nMy speciality: %s",super.toString(),swim());
    }
}
