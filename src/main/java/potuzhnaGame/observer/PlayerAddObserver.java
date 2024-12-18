package potuzhnaGame.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlayerAddObserver implements Observer{

    private String name;

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
