package bei.chu.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C31Test {
private C31 c31;
    
    @Before
    public void test(){
        c31 = new C31();
    }
    @Test
    public void testM1() {
        assertEquals(c31.m1(), "m1");
    }

    @Test
    public void testM2() {
        assertEquals(c31.m2(), "m2");
    }

}