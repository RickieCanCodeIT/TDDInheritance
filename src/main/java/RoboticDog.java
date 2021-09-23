public class RoboticDog extends RoboticPet implements  Walkable{

    private int roboSatisfaction;

    public RoboticDog(String name) {
        super(name);
        roboSatisfaction = 50;
    }

    public int getRoboSatisfaction() {
        return roboSatisfaction;
    }

    @Override
    public void oilPet() {
        oilLevel += 50;
        roboSatisfaction -= 10;
    }

    @Override
    public void walk() {
        oilLevel -= 10;
        roboSatisfaction += 50;
    }
}
