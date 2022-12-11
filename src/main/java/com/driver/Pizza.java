package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private String  totalBill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            setPrice(300);
            setBill("Base Price Of The Pizza = 300\n");
        }
        else {
            setPrice(400);
            setBill("Base Price Of The Pizza = 400\n");
        }
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        setPrice(getPrice()+80);
        setBill(getBill()+"Extra Cheese Added = 80\n");

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            setPrice(getPrice()+70);
            setBill(getBill()+"Extra Toppings Added = 70\n");
        }
        else{
            setPrice(getPrice()+120);
            setBill(getBill()+"Extra Toppings Added = 120\n");
        }
    }

    public void addTakeaway(){
        // your code goes here
        setPrice(getPrice()+20);
        setBill(getBill()+"Paperbag Added = 20\n");

    }

    public String getBill(){
        // your code goes here

        return this.bill;
    }

    public String getTotalBill() {
        return getBill()+"Total Price = "+getPrice()+"\n";
    }
}
