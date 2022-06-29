package tddClass;

public class UnicornOilAndGas {
    private String location;
    private double literBought;
    private final double pricePerLiter = 200;

    public UnicornOilAndGas(String location){
    this.location = location;
}
    public void setLiterBought(double literBought){
        this.literBought = literBought;
    }
    public double getLiterBought(){
        return literBought;
    }
    public double petrolAmount(){
        double amount = pricePerLiter * getLiterBought();
        return amount;
    }
    private   double discount(){
        double discount = petrolAmount() * 2 /100;
        return discount;
    }

    public  double priceAfterDiscount(){
        double priceAfterDiscount = petrolAmount() - discount();
        return priceAfterDiscount;
    }


}
