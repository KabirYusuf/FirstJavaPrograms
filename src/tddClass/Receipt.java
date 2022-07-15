package tddClass;

public class Receipt {
    private  String customerName;
    private  String itemBought;
    private  int quantity;
    private  double pricePerUnit;

    private double total;

    public Receipt (String itemBought, int quantity, double pricePerUnit,double total){
        this.itemBought = itemBought;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.total = total;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return customerName;
    }

    public String getItemBought(){
        return itemBought;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPricePerUnit(){
        return pricePerUnit;
    }



    public void printFormat(){
        System.out.printf("\t\t\t%-8S\t\t\t%d\t\t\t%.2f\t\t\t%.2f",itemBought, quantity,pricePerUnit,total);
        System.out.println();
        System.out.println();

    }
}

