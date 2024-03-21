package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println("-----------------------------------------");

        Player player=new Player("Semra",49,Weapon.RIFLE);
        Player player1= new Player("Ahmet",30,Weapon.SWORD);
        System.out.println(player);
        System.out.println(player1);
        System.out.println(player.getName()+"isimli oyuncunun canı: "+ player.healthRemaining());
        System.out.println(player1.getName()+"isimli oyuncunun canı: "+ player1.healthRemaining());

        player.loseHealth(40);
        System.out.println(player);
        player.restoreHealth(50);
        System.out.println(player);
        player1.loseHealth((int)(player.getWeapon().getDamage()*player.getWeapon().getAttackSpeed()));
        System.out.println(player1);










    }
}