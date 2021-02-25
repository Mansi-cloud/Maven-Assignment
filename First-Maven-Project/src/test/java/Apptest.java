import static org.junit.Assert.*;

import org.junit.Test;

public class Apptest
{
	@Test
	public void testApp()
    {
        assertEquals(0,new App().calculateSomething());
    }
}