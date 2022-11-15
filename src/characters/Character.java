package src.characters;

import src.equipment.armors.Armor;
import src.equipment.weapons.Weapon;

public class Character {

    String name;
    int abilityPoints;
    String faction;
    int healthPoints;
    int level;
    Armor bodyArmor;
    Weapon weapon;

    public void setAbilityPoints(int abilityPoints) throws Exception {
        if (abilityPoints >= 0) {
            this.abilityPoints = abilityPoints;
        } else {
            throw new Exception("AbilityPoints cannot be lesser then 0");
        }
    }

    public void setHealthPoints(int healthPoints) throws Exception {
        if (healthPoints >= 0) {
            this.healthPoints = healthPoints;
        } else {
            throw new Exception("healthPoints cannot be lesser then 0");
        }
    }

    public void setLevel(int level) throws Exception {
        if (level >= 0) {
            this.level = level;
        }else{
            throw new Exception("Level cannot be lesser then 0");
        }
    }
}
