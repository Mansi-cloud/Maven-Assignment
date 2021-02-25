import static org.junit.Assert.*;

import org.junit.Test;

public class Apptest1
{
	@Test
	public void testApp()
    {
        assertEquals(0,new App1().calculateSomething());
    }
}
