package potuzhnaGame;

import potuzhnaGame.player.Archer;
import potuzhnaGame.player.Character;
import potuzhnaGame.player.Warlock;
import potuzhnaGame.player.Warrior;

public class CharacterFactory {

    public Character createCharacter(String type, String name, int health, int x, int y, int currentDamage, Arena arena){
        switch (type.toLowerCase()){
            case "warrior" ->{
                return new Warrior(name, health, x, y, currentDamage, arena);
            } case "warlock" ->{
                return new Warlock(name, health, x, y, currentDamage, arena);
            } case "archer" ->{
                return new Archer(name, health, x, y, currentDamage, arena);
            } default -> {
                throw new IllegalArgumentException("Wrong character type");
            }
        }
    }
}
