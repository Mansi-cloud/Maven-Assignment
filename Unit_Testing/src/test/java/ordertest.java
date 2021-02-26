import static org.junit.Assert.*;

import org.junit.Test;

public class ordertest {
    @Test
	public void should_ReturnTrue_when_QuantityIsSame() {
		
		order order=new order();
		order.setQuantity(8);
		assertEquals(order.getQuantity(),8);
}
	@Test
	public void should_ReturnTrue_When_itemNameIsSame() {
		order order=new order();
		order.setItemName("item");
		assertEquals(order.getItemName(),"item");
	}
	@Test
	public void should_ReturnTrue_When_PriceIsSame() {
		order order=new order();
		order.setPrice(500);
		assertEquals(500,500);
		
	}
	@Test
	public void should_ReturnTrue_When_PriceWithTexIsSame() {
		order order=new order();
		order.setPriceWithTex(500);
		assertEquals(500,500);
	}
}



