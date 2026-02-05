import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

import static org.example.Main.checkAge;

public class MainTest {
    @Test
    public void  testChild(){

        Assert.assertEquals("ребёнок",checkAge(10));
        Assert.assertEquals("взрослый",checkAge(35));
        Assert.assertEquals("пенсионер", checkAge(61));
    }

}
