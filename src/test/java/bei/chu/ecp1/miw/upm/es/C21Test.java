package bei.chu.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

	public class C21Test {
		    private C21 c21;
		    
		    @Before
		    public void test(){
		        c21 = new C21();
		    }
		    @Test
		    public void testM1() {
		        assertEquals(c21.m1(), "m1");
		    }
		
		    @Test
		    public void testM2() {
		        assertEquals(c21.m2(), "m2");
		    }
	}
		