public abstract class OrganicPet extends VirtualPet {

    protected int hunger;


    public OrganicPet(String name) {
        super(name);
        hunger = 50;
    }

    public int getHunger() {
        return hunger;
    }

    public abstract void feed();
}
