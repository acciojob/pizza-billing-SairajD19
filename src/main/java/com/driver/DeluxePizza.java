package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        addExtraCheese();
        addExtraToppings();
        // your code goes here
        /*if(isVeg){
            setPrice(getPrice()+150);
        }
        else{
            setPrice(getPrice()+200);
        }*/

    }

}
