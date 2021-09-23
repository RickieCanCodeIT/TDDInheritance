import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//roboticDogHasName, roboticDogCanBeOiled, roboticDogCanBeOiledMoreThanOnce, roboticDogCanGoOnWalks
public class RoboticDogTest {

    @Test
    public void roboticDogHasAName() {
        RoboticDog mechafido = new RoboticDog("Mechafido");
        String name = mechafido.getName();
        assertEquals("Mechafido", name);
    }

    @Test
    public void roboticDogCanBeOiled() {
        RoboticDog mechafido = new RoboticDog("Mechafido");
        mechafido.oilPet();
        assertEquals(100, mechafido.getOilLevel());
    }

    @Test
    public void roboticDogCanBeOiledMoreThanOnce() {
        RoboticDog mechafido = new RoboticDog("Mechafido");
        mechafido.oilPet();
        mechafido.oilPet();
        assertEquals(150, mechafido.getOilLevel());
    }

    @Test
    public void roboticDogShouldBeAbleToWalk() {
        RoboticDog mechafido = new RoboticDog("Mechafido");
        mechafido.walk();
        assertEquals(40, mechafido.getOilLevel());
    }
}
