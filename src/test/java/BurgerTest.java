import org.junit.Test;
import org.mockito.Mockito;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class BurgerTest {
    public static final String RECEIPT = "(==== Мексиканская ====)" + System.lineSeparator() +
            "= filling той-терьер =" + System.lineSeparator() +
            "(==== Мексиканская ====)" + System.lineSeparator() +
            System.lineSeparator() +
            "Price: 9,000000" + System.lineSeparator();

    @Test
    public void receiptTest() {
        Bun bun = Mockito.mock(Bun.class);
        Ingredient ingredient = Mockito.mock(Ingredient.class);
        Mockito.when(bun.getName()).thenReturn("Мексиканская");
        Mockito.when(ingredient.getName()).thenReturn("той-терьер");
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING);
        Burger burger = Mockito.spy(Burger.class);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.doReturn(9f).when(burger).getPrice();
        assertEquals(RECEIPT, burger.getReceipt());
    }

    @Test
    public void priceTest() {
        Bun bun = Mockito.mock(Bun.class);
        Ingredient ingredient = Mockito.mock(Ingredient.class);
        Mockito.when(bun.getPrice()).thenReturn(9.99f);
        Mockito.when(ingredient.getPrice()).thenReturn(0.01f);
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        assertEquals(19.99f, burger.getPrice(), 0.001);
    }
}
