package kg.geeks.game.players;

public abstract class Witcher extends kg.geeks.game.players.Hero {
    private int reviveChance = 1;

    public Witcher(int health, int damage, String name, kg.geeks.game.players.SuperAbility ability) {
        super(health, damage, name, ability);
    }

    @Override
    public void attack(kg.geeks.game.players.Boss boss) {
        // не наносит урон боссу
    }

    @Override
    public void useSpecialAbility(kg.geeks.game.players.Boss boss) {
        if (reviveChance > 0) {

            reviveChance--;
        }
    }

    @Override
    public String getName() {
        return "Witcher";
    }
}


