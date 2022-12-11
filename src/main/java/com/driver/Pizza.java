package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private String adder;
    boolean alreadyExecuted = false;
    boolean isAlreadyExecuted = false;

    public String getAdder() {
        return adder;
    }

    public void setAdder(String adder) {
        this.adder = adder;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            setPrice(300);
            setAdder("Base Price Of The Pizza: 300\n");
        }
        else{
            setPrice(400);
            setAdder("Base Price Of The Pizza: 400\n");
        }
    }


    public void setPrice(int price) {

        this.price = price;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isAlreadyExecuted) {
            setPrice(getPrice() + 80);
            setAdder(getAdder() + "Extra Cheese Added: 80\n");
            isAlreadyExecuted = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!alreadyExecuted) {
            alreadyExecuted = true;
            if (isVeg) {
                setPrice(getPrice() + 70);
                setAdder(getAdder() + "Extra Toppings Added: 70\n");
            } else {
                setPrice(getPrice() + 120);
                setAdder(getAdder() + "Extra Toppings Added: 120\n");
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        setAdder(getAdder()+"Paperbag Added: 20\n");
        setPrice(getPrice()+20);

    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getBill(){
        // your code goes here
        setBill(getAdder()+"Total Price: "+getPrice()+"\n");

        return this.bill;
    }
}
