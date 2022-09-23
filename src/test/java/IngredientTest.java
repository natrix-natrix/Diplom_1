import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    @Test
    public void typeIngredientTest(){
        IngredientType type = IngredientType.FILLING;
        Ingredient ingredient = new Ingredient(type,"zero",0);
        assertEquals( type, ingredient.getType());
    }

    @Test
    public void nameIngredientTest(){
        String name = "чихуахуа";
        Ingredient ingredient = new Ingredient(null,name,0);
        assertEquals(name, ingredient.getName());
    }

    @Test
    public void priceIngredientTest(){
        float price = 9.99f;
        Ingredient ingredient = new Ingredient(null,"zero",price);
        assertEquals( price, ingredient.getPrice(),0.001);
    }


}
