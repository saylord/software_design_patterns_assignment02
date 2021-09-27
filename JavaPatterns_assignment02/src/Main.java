import entities.observables.GameSystem;
import entities.observers.Dire;
import entities.observers.Radiant;

public class Main {

    public static void main(String[] args) {

        // Creating the game
        GameSystem gameSystem = new GameSystem();

        // Creating commands: DIRE - 5 & RADIANT - 5
        Radiant radiant1 = new Radiant("Drow Ranger");
        Radiant radiant2 = new Radiant("Bristleback");
        Radiant radiant3 = new Radiant("Dazzle");
        Radiant radiant4 = new Radiant("Bounty Hunter");
        Radiant radiant5 = new Radiant("Tiny");

        Dire dire1 = new Dire("Lich");
        Dire dire2 = new Dire("Ogre Magi");
        Dire dire3 = new Dire("Phantom Lancer");
        Dire dire4 = new Dire("Arc Warden");
        Dire dire5 = new Dire("Luna");

        // Register them to the game
        gameSystem.registerRadiantHero(radiant1); gameSystem.registerDireHero(dire1);
        gameSystem.registerRadiantHero(radiant2); gameSystem.registerDireHero(dire2);
        gameSystem.registerRadiantHero(radiant3); gameSystem.registerDireHero(dire3);
        gameSystem.registerRadiantHero(radiant4); gameSystem.registerDireHero(dire4);
        gameSystem.registerRadiantHero(radiant5); gameSystem.registerDireHero(dire5);

        gameSystem.addDireNotification("Your top tower is under attack.");
        gameSystem.removeDireNotification("Your top tower is under attack.");

        gameSystem.addRadiantNotification("We now have megacreeps.");
        gameSystem.removeRadiantNotification("We now have megacreeps.");

    }
}
