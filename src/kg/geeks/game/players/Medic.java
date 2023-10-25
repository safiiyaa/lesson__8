package kg.geeks.game.players;

public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String name, int healPoints) {
        super(health, damage, name, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperPower(kg.geeks.game.players.Boss boss, kg.geeks.game.players.Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                heroes[i].setHealth(heroes[i].getHealth() + this.healPoints);
            }
        }
    }
    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
    public int getHealPoints() {
        return healPoints;
    }

    @Override
    public void useSpecialAbility(Boss boss) {

    }
}

