import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//organicDogHasAName, organicDogShouldBeWalkable, organicDogShouldWalk
public class OrganicDogTest {

    @Test
    public void organicDogHasAName() {
        OrganicDog fido = new OrganicDog("Fido");
        String dogName = fido.getName();
        assertEquals("Fido", dogName);
    }

    @Test
    public void organicDogShouldBeWalkable() {
        OrganicDog fido = new OrganicDog("Fido");
        boolean canWalk = fido instanceof Walkable;
        assertTrue(canWalk);
    }

    @Test
    public void organicDogShouldWalk() {
        OrganicDog fido = new OrganicDog(("Fido"));
        fido.walk();
        int fidoHunger = fido.getHunger();
        assertEquals(60, fidoHunger);
    }
}
