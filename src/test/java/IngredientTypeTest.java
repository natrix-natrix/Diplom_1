import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTypeTest {
    @Test
    public void sauceTest() {
        assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
    }
    @Test
    public void fillingTest() {
        assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }
}
