package kg.geeks.game.players;

public class Golem extends Hero {
    public Golem(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SHIELD);
    }

    @Override
    public void applySuperPower(kg.geeks.game.players.Boss boss, Hero[] heroes) {

        int totalDamage = 0;
        for (Hero hero : heroes) {
            if (hero != this) {
                totalDamage += hero.getDamage();
            }
        }
        int damageTaken = totalDamage / 5;
        this.setHealth(this.getHealth() - damageTaken);
    }

    @Override
    public void useSpecialAbility(Boss boss) {

    }
}
