package classExercise.animalProject;

public class Main {
    public static void main(String[] args) {
        FlyingAnimal bird = new FlyingAnimal("dove","gray","5","1",false);
        Animal turkey = new FlyingAnimal("Yorkiee","Yoyo","18","3.8",false);

        bird.move(1);

        turkey.move(2);

        Animal [] animals = new Animal[3];
        animals[0] = new FlyingAnimal("bird", "white", "18", "2", false);
        animals[1] = new LandAnimal("Goat","black","3","6");
        animals[2] = new WaterAnimal("Fish","blue", "7", "9");


        for (int i = 0; i < animals.length; i++) {

            System.out.printf("Animal %d is a %s%n",i,animals[i].getClass().getName());
        }

        LandAnimal dog = (LandAnimal) new Animal("jskf","fddj","gnr","eignef");








//        bird.isHaveFeather("no");
//        System.out.println(bird);
//        bird.move(5);

//        LandAnimal goat = new LandAnimal("goat","black", "9","18");
//        goat.run();
//        System.out.println(goat);
//        goat.eat();
    }
}
