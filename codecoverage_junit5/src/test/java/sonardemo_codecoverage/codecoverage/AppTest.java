package sonardemo_codecoverage.codecoverage;

import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.Test;

import sonardemo_codecoverage.business.Demo;


public class AppTest {
   
    @Test
    public void testPositiveCheck()
    {
        Assertions.assertEquals(true,Demo.check("admin","admin"));
    }
    
    @Test
    public void testNegativeCheck()
    {
        Assertions.assertFalse(Demo.check("admin","12345"));
    }
}
