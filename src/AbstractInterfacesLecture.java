public class AbstractInterfacesLecture {

    public static void main(String[] args) {
//        Developer newGuy = new Developer("Kelvyn", "Delivery");
//        System.out.println(newGuy.work());

        Animal bigBear = new Bear("Yogi", "Bear", "Grizzly", true);
        System.out.println(bigBear.getName());
System.out.println(((Bear) bigBear).getSkin());





    }
}
abstract  class Employee {
    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public abstract String work();

}

class Developer extends Employee {
    public Developer(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return null;
    }

}

abstract class Notification {
    public abstract boolean didOptIn();
    public abstract String unsubscribeLink();
    public abstract String getPhysicalAddress();
    public abstract String getSenderInfo();

}

abstract class Animal {
    protected String name;
    protected String species;
    protected String breed;
    protected boolean isLegendary;

    public Animal(String name, String species, String breed, boolean isLegendary) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.isLegendary = isLegendary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }
}

class Bear extends Animal implements Skinnable {

    public Bear(String name, String species, String breed, boolean isLegendary) {
        super(name, species, breed, isLegendary);
    }

    @Override
    public String getSkin() {
        if (this.isLegendary){
            return "You skinned a legendary animal!";
        } else {
            return "You skinned the " + this.name + "!";
        }
    }
}

abstract class  Wishlist {
    protected String name;
    protected String [] items;

    public Wishlist(String name, String[] items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public void addItem(String item){

    }
}