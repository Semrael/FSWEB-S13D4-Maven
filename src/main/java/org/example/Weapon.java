package org.example;

public enum Weapon {
    SWORD(5,3),
    RIFLE(12,4),
    MACHINEGUN(15,2);

   private int damage;
   private double attackSpeed;

    Weapon(int damage,double attackSpeed) {
       this.damage = damage;
       this.attackSpeed = attackSpeed;
   }

   public int getDamage(){
       return damage;}

    public double getAttackSpeed(){
       return attackSpeed;}


}






