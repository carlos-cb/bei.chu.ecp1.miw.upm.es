package bei.chu.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C12Test {

private C12 c;
    
    @Before
    public void test(){
        c = new C12();
    }
    @Test
    public void testM1() {
        assertEquals(c.mA(), "mA");
    }



}