package technology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Program {
    Computer comp = new Computer("win",512,false);
    Laptop lap = new Laptop("win",1024, true, false);
    SmartPhone phone = new SmartPhone("iOS", 2048,true,true);
    @Test
    public void firstTest() {
        assertEquals(comp.increaseMem(512),1024);
    }
    @Test
    public void secondTest() {
        assertFalse(lap.isTouchEnabled());
    }
    @Test
    public void thirdTest() {
        assertEquals(phone.installOS("android"),"android");
    }
}
