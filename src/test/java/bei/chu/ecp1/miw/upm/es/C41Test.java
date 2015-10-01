package bei.chu.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C41Test {

private C41 c41;
    
    @Before
    public void test(){
        c41 = new C41();
    }
    @Test
    public void testM1() {
        assertEquals(c41.m1(), "m1");
    }

    @Test
    public void testM2() {
        assertEquals(c41.m2(), "m2");
    }

}
