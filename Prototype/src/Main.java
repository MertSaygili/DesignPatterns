import models.Trooper;

//* Prototype Design Pattern, used to create a clone of an object
//* This is useful when you want to create a new object with the same values as an existing object
public class Main {
    public static void main(String[] args) {
            Trooper trooper1 = new Trooper(1, "Trooper 1", "Private", "Blaster", "Stormtrooper Armor");
            Trooper trooper2 = trooper1.clone();
            Trooper trooper3 = trooper1.clone();
            Trooper trooper4 = trooper1.clone();
            Trooper trooper5 = trooper1.clone();

            trooper2.setId(2).setName("Trooper 2").setRank("Corporal").setWeapon("Blaster Rifle");
            trooper3.setId(3).setName("Trooper 3").setRank("Sergeant").setWeapon("Blaster Rifle");
            trooper4.setId(4).setName("Trooper 4").setRank("Lieutenant").setWeapon("Rifle");
            trooper5.setId(5).setName("Trooper 5").setRank("Captain").setWeapon("Single Shot Rifle");

            System.out.println(trooper1);
            System.out.println(trooper2);
            System.out.println(trooper3);
            System.out.println(trooper4);
            System.out.println(trooper5);
    }
}