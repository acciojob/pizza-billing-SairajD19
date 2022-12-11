package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here

        if(isVeg){
            setPrice(getPrice()+70+80);
            //setPrice(450);
        }
        else{
            setPrice(getPrice()+120+80);
            //setPrice(600);
        }

    }

}
