package entities.observers;

import entities.interfaces.IObserver;

import java.util.List;

public class Dire implements IObserver {

    private String heroName;

    public Dire(String heroName) {
        this.heroName = heroName;
    }

    @Override
    public void update(List<String> notifications) {
        System.out.println("Dear " + this.heroName + ", from Dire \n" + notifications + "\n");
    }
}
