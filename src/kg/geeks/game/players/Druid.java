package kg.geeks.game.players;

import java.util.Random;

public class Druid extends Hero {
    private boolean hasSummonedHelper = false;

    public Druid(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SUMMON);
    }

    @Override
    public void applySuperPower(kg.geeks.game.players.Boss boss, Hero[] heroes) {

        if (!hasSummonedHelper) {
            Random random = new Random();
            int randomNumber = random.nextInt(2); // 0 - ангел, 1 - ворон
            if (randomNumber == 0) {

                for (Hero hero : heroes) {
                    if (hero instanceof Medic) {
                        ((Medic) hero).setHealPoints(((Medic) hero).getHealPoints() + 10);
                    }
                }
            } else {

                if (boss.getHealth() < 50) {
                    boss.setDamage((int) (boss.getDamage() * 1.5));
                }
            }
            hasSummonedHelper = true;
        }
    }

    @Override
    public void useSpecialAbility(Boss boss) {

    }
}
