import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
    @Test
    public void nameBunTest(){
        String name = "кунжутная";
        Bun bun = new Bun(name,0);
        assertEquals(name, bun.getName());
    }

    @Test
    public void priceBunTest(){
        float price = 9.99f;
        Bun bun = new Bun("zero",price);
        assertEquals( price, bun.getPrice(),0.001);
    }
}
