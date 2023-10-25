package kg.geeks.game.players;

public abstract class Hero extends kg.geeks.game.players.GameEntity implements HavingSuperAbility {
    private SuperAbility ability;

    public Hero(int health, int damage, String name, SuperAbility ability) {
        super(health, damage, name);
        this.ability = ability;
    }

    public void attack(kg.geeks.game.players.Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public abstract void useSpecialAbility(kg.geeks.game.players.Boss boss);
}
