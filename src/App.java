public class App {
    public static void main(String[] args) {

    }
    public void createSquadron(SquadronFactory factory) {
        Mage mage = factory.createMage();
        Archer archer = factory.createArcher();
        Warrior warrior = factory.createWarrior();
    }
}
