package potuzhnaGame;

import potuzhnaGame.observer.Observer;
import potuzhnaGame.player.Character;

import java.util.ArrayList;
import java.util.List;

public class Arena{

    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObserver(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObserver("New character added: " + character.getName());
    }

    public void attack(Character attacker, Character target, int hp) {
        if (characters.contains(attacker) && characters.contains(target) && attacker != target) {
            target.takeDamage(hp);
            System.out.println(attacker.getName() + " attacks " + target.getName());
        } else {
            throw new IllegalArgumentException("Either attacker or target is not in the arena or they are the same character.");
        }
    }
}
