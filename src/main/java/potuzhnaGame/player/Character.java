package potuzhnaGame.player;

import lombok.Getter;
import lombok.Setter;
import potuzhnaGame.Arena;

@Getter @Setter
public abstract class Character {

    private String name;
    private int maxHealth;
    private int currentHealth;
    private int x;
    private int y;
    private int currentDamage;
    private Arena arena;

    public Character(String name, int maxHealth, int x, int y, int currentDamage, Arena arena) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.x = x;
        this.y = y;
        this.currentDamage = currentDamage;
        this.arena = arena;
    }

    public void move(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public void attack(Character enemy){
        arena.attack(this, enemy, this.currentDamage);
    }

    public void takeDamage(int hp){
        this.currentHealth -= hp;
    }
}
