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

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int healthRemaining(){
        return this.healthPercentage;
    }
    public void loseHealth(int damage){
       int healthRemain=this.healthPercentage-damage;
       if(healthRemain<0){
            System.out.println(this.name+" has been knocked out of game");
           healthPercentage=0;

       }
       else{
           this.healthPercentage=healthRemain;}

    }
    public void restoreHealth(int healthPoint){
        this.healthPercentage+=healthPoint;
        if(healthPercentage>100){
            healthPercentage=100;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}


