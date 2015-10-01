package bei.chu.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C32Test {
    private C32 c32;
    
    @Before
    public void c32(){
        c32 = new C32();
    }
    @Test
    public void testMA() {
        assertEquals(c32.mA(), "mA");
    }
}