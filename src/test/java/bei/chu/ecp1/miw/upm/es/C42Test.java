package bei.chu.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C42Test {
	 private C42 c42;
	
	 @Before
	 public void c42(){
		 c42 = new C42(); 
	 }
     @Test
     public void testMA() {
		assertEquals(c42.mA(), "mA");
    }
}
