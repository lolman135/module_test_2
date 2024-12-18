package potuzhnaGame;

import potuzhnaGame.player.Character;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void attack(Character attacker, Character target, int hp) {
        if (characters.contains(attacker) && characters.contains(target) && attacker != target) {
            target.takeDamage(hp);
        } else {
            throw new IllegalArgumentException("Either attacker or target is not in the arena or they are the same character.");
        }
    }
}
