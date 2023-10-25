package kg.geeks.game.players;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {
        super(health, damage, name, kg.geeks.game.players.SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(kg.geeks.game.players.Boss boss, kg.geeks.game.players.Hero[] heroes) {

        boss.stun();
        System.out.println("Thor stuns the boss for 1 round!");
    }

    @Override
    public void useSpecialAbility(Boss boss) {

    }
}
