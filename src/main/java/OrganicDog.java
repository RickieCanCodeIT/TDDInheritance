public class OrganicDog extends OrganicPet implements Walkable {

    private int boredom;
    public OrganicDog(String name) {
        super(name);
        boredom = 50;
    }

    @Override
    public void feed() {
        hunger -= 50;
        boredom += 10;
    }

    @Override
    public void walk() {
        hunger += 10;
        boredom -= 50;
    }
}
