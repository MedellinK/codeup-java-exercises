package rpg;

public class RPG {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.setName("Arata");
        fighter1.setHitPoints(17);
        fighter1.setMaxDamage(14);
//        fighter1.printStats();

        Fighter fighter2 = new Fighter();
        fighter2.setName("Sozalix");
        fighter2.setHitPoints(25);
        fighter2.setMaxDamage(23);
//        fighter2.printStats();

        Fighter fighter3 = new Fighter("Shrek", 95, 45);
//        fighter3.printStats();

        Fighter fighter4 = new Fighter("Therion");
//        fighter4.printStats();

        int d20roll = D20.rolld20();
//        System.out.println(d20roll);

//        System.out.println(Fighter.totalFighters);
    }
}