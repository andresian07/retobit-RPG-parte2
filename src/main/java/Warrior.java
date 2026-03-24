public class Warrior extends Character implements Combatant{
    private int strength;

    protected Warrior(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    public void attack(Character target){

    }

    public void performHeavyAttack(Character target){

    }

    public void enterBerserkMode(){

    }

    public int getStrength(){
        return this.strength;
    }

}
