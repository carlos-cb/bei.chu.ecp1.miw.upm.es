package bei.chu.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C22Test {

    private C22 c22;
    @Before
    public void c22(){
        c22 = new C22();
    }
    @Test
    public void testMA() {
        assertEquals(c22.mA(), "mA");
    }

}
