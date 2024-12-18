package potuzhnaGame;

import potuzhnaGame.observer.PlayerAddObserver;
import potuzhnaGame.player.Character;

public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();
        PlayerAddObserver observer = new PlayerAddObserver("Observer1");
        arena.addObserver(observer);

        CharacterFactory characterFactory = new CharacterFactory();

        Character warrior = characterFactory.createCharacter("warrior", "Strong Warrior", 100, 0, 0, 20, arena);
        Character warlock = characterFactory.createCharacter("warlock", "Mighty Warlock", 80, 1, 1, 15, arena);
        Character archer = characterFactory.createCharacter("archer", "Quick Archer", 70, 2, 2, 25, arena);

        arena.addCharacter(warrior);
        arena.addCharacter(warlock);
        arena.addCharacter(archer);

        warrior.attack(warlock);
        warlock.attack(archer);
        archer.attack(warrior);
    }
}
