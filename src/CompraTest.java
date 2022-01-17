import static org.junit.Assert.*;

import org.junit.Test;

public class CompraTest {

	@Test
	public void testGetPatalones() {
		Compra carrito1 = new Compra();
		carrito1.realizarCompra();
		carrito1.realizarCompra();
		assertEquals(carrito1.getPatalones(),2);
	}

	@Test
	public void testGetCamisas() {
		Compra carrito2 = new Compra();
		carrito2.realizarCompra();
		assertTrue(carrito2.getCamisas()==1);
	}

	@Test
	public void testGetSudaderas() {
		Compra carrito3 = new Compra();
		carrito3.realizarCompra();
		carrito3.realizarCompra();
		carrito3.realizarCompra();
		assertEquals(carrito3.getSudaderas(),3);
	}

}
