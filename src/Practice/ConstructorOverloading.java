package practice;

public class ConstructorOverloading {
    public String name;
    public String pin;
    public String address;

    public ConstructorOverloading(String name, String pin, String address){
        this.name = name;
        this.pin = pin;
        this.address = address;
    }
    public ConstructorOverloading(){
        this("bola", "1234", "yaba");
    }
    public ConstructorOverloading(String pin, String address){
        this("Ade","ola","sabo");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public static void main(String[] args) {
        ConstructorOverloading jay = new ConstructorOverloading("saka","james");
        ConstructorOverloading bebe = new ConstructorOverloading();
        ConstructorOverloading me = new ConstructorOverloading("Abu","2727","jibowu");


        System.out.println(jay.getName());
        System.out.println(bebe.getName());
        System.out.println(me.getName());
    }
}
