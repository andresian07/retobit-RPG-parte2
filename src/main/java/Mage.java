class Mage extends Character implements Combatant {
    private int mana;

    protected Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    public void attack(Character target){

    }



    public void castSpell(Character target){
       if (this.mana >= 10){
           this.mana -= 10;
           target.receiveDamage(20);
           target.setStatus(Status.POISONED);

       }
       ;
    }

    public void heal(Character target){
        if (this.mana >= 15){
            this.mana -= 15;
            target.setCurrentHealth(20);
        }

    }

    public int getMana() {
        return this.mana;
    }
}
