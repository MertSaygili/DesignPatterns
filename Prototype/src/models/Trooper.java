package models;


//* Star Wars Troopers, used to clone objects, implements Cloneable interface
//* is used to indicate that a class implements the clone() method, defined in the Object class
//* Cloneable interface is a marker interface, it does not contain any methods, it is used to indicate that a class allows a bitwise copy of an object
public class Trooper implements Cloneable {
    private long id;
    private String name;
    private String rank;
    private String weapon;
    private String armor;

    public Trooper(long id, String name, String rank, String weapon, String armor) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.weapon = weapon;
        this.armor = armor;
    }

    //* Clone method, used to clone objects
    @Override
    public Trooper clone() {
        try {
            System.out.println("Cloning object: " + this);
            return (Trooper) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported for this object: " + e.getMessage());
            throw new RuntimeException("Clone not supported for this object");
        }
    }

    //* Getters and Setters, used to get and set values
    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getArmor() {
        return armor;
    }

    public long getId() {
        return id;
    }

    public Trooper setId(long id) {
        this.id = id;
        return this;
    }

    public Trooper setName(String name) {
        this.name = name;
        return this;
    }

    public Trooper setRank(String rank) {
        this.rank = rank;
        return this;
    }

    public Trooper setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public Trooper setArmor(String armor) {
        this.armor = armor;
        return this;
    }


    //* toString() method
    @Override
    public String toString() {
        return "models.Troopers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", weapon='" + weapon + '\'' +
                ", armor='" + armor + '\'' +
                '}';
    }
}
