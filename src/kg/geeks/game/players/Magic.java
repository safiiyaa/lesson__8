package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Magic extends Hero {
    private int attackBoost; // Поле для хранения увеличения атаки

    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
        this.attackBoost = 0;
    }

    @Override
    public void applySuperPower(kg.geeks.game.players.Boss boss, kg.geeks.game.players.Hero[] heroes) {
        // Увеличить атаку каждого героя после каждого раунда на n-ное количество (например, 10)
        this.attackBoost += 10;
        System.out.println("Magic boosts attack of all heroes by " + attackBoost);
        for (kg.geeks.game.players.Hero hero : heroes) {
            hero.setDamage(hero.getDamage() + attackBoost);
        }
    }

    @Override
    public void useSpecialAbility(Boss boss) {

    }
}
