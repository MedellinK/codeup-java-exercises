package collections;
import java.util.ArrayList;
import rpg.*;
import vehicles.*;

public class CollectionsLecture {

    public static void main(String[] args) {
//        Monster orc = new Monster("Orc", 13, 15, 9);
//        Monster ogre = new Monster("Ogre", 11, 59, 13);
//        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);
//
//        ArrayList<Monster> monsterList = new ArrayList<>();
//
//        monsterList.add(orc);
//        monsterList.add(ogre);
//        monsterList.add(blueDragon);
//
//        for (Monster monster : monsterList) {
//            System.out.println(monster.getName());
//        }
//
//        System.out.println(monsterList.size());
//
//        System.out.println(monsterList.get(1).getName());

        Vehicle car = new Vehicle();
        car.setName("Honda");

        Vehicle motorcycle = new Vehicle();
        motorcycle.setName("Harley");

        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(car);
        vehicleList.add(motorcycle);

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getName());
        }

        System.out.println(vehicleList.size());


    }


}
