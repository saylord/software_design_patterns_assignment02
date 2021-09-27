package entities.observers;

import entities.interfaces.IObserver;

import java.util.List;

public class Radiant implements IObserver {

    private String heroName;

    public Radiant(String heroName) {
        this.heroName = heroName;
    }

    @Override
    public void update(List<String> notifications) {
        System.out.println("Dear " + this.heroName + ", from Radiant \n" + notifications + "\n");
    }
}
