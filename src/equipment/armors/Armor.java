package src.equipment.armors;

public class Armor {
    public Armor(int armorPoints) {
        this.armorPoints = armorPoints;
    }

    int armorPoints;

    public void setArmorPoints(int armorPoints) throws Exception {
        if (armorPoints >= 1) {
            this.armorPoints = armorPoints;
        }else{
            throw new Exception("ArmorPoints cannot be lesser then 1");
        }
    }
}
