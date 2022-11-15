package src.equipment.weapons;

public class Weapon {

    int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    public void setDamage(int damage) throws Exception {
        if (damage >= 1){
            this.damage = damage;
        }else{
            throw new Exception("Damage cannot be lesser then 1");
        }
    }
}
