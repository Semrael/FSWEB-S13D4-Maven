package org.example;

public class Player {
    private String name;
    private int healthPercentage;

    private Weapon weapon;

    public Player(String name,int healthPercentage,Weapon weapon){
        this.name=name;
        this.weapon=weapon;
        if(healthPercentage>100){
            healthPercentage=100;
        } else if (healthPercentage<0) {
            healthPercentage=0;
        }
        this.healthPercentage=healthPercentage;

    }


}


