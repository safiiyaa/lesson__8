package kg.geeks.game.players;

public class Avrora extends Hero {
    private boolean isInvisible = false;
    private boolean canUseInvisibility = true;

    public Avrora(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.INVISIBILITY);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        if (isInvisible && canUseInvisibility) {
            isInvisible = false;
            canUseInvisibility = false;
        } else if (!isInvisible && canUseInvisibility) {
            isInvisible = true;
            canUseInvisibility = false;
        } else if (isInvisible) {

            boss.setHealth(boss.getHealth() - this.getDamage());
            canUseInvisibility = true;
        }
    }

    @Override
    public void useSpecialAbility(Boss boss) {

    }
}
