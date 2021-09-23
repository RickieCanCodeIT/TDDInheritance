public abstract class RoboticPet extends VirtualPet{
    protected int oilLevel;

    public RoboticPet(String name) {
        super(name);
        oilLevel = 50;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public abstract void oilPet();
}
