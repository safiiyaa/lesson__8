package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, name, kg.geeks.game.players.SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(kg.geeks.game.players.Boss boss, kg.geeks.game.players.Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(9) + 2;
        boss.setHealth(boss.getHealth() - this.getDamage() * coeff);
        System.out.println("Warrior " + this.getName() + " hits critically " + this.getDamage() * coeff);
    }

    @Override
    public void useSpecialAbility(Boss boss) {

    }
}
