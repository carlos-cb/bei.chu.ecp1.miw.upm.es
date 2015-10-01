package bei.chu.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C11Test {

    private C11 c11;
    @Before
    public void c11(){
        c11 = new C11();
    }

    @Test
    public void m1test() {
        assertEquals(c11.m1(), "m1");
    }
    
    @Test
    public void m2test() {
        assertEquals(c11.m2(), "m2");
    }

}