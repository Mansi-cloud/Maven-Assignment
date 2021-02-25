import static org.junit.Assert.*;

import org.junit.Test;

public class apptest1 
{
	@Test
	public void testApp()
    {
        assertEquals(0,new App1().calculateSomething());
    }
}
