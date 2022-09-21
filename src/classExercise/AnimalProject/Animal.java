package classExercise.animalProject;

public class Animal {
    private String name;
    private String colour;
    private String age;
    private String height;

    public Animal(String name,String colour, String age, String height){
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.height = height;
    }

    public void setName(String name){
        this.name = name;
    }
    public  String getName(){
        return  name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public  String getAge(){
        return  age;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public  String getColour(){
        return  colour;
    }
    public void setHeight(String height){
        this.height = height;
    }
    public  String getHeight(){
        return  height;
    }

    public void  eat(){
        System.out.println("I am eating");
    }

    public void move(int speed){
        //System.out.println("Animal.move() method called");
        System.out.println("I am moving at speed "+ " "+ speed);
    }

    @Override
    public String toString(){
        return  String.format("Animal name: %s%nAnimal colour: %s" +
                "%nAnimal age: %s%nAnimal height: %s",getName(),getColour(),getAge(),getHeight());
    }
}
