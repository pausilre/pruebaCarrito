
public class Compra {
	
	private int pantalones;
	private int camisas;
	private int sudaderas;
	
	public void realizarCompra() {
		pantalones++;
		camisas++;
		sudaderas++;
	}
	
	public int getPatalones() {
		return pantalones;
	}
	public int getCamisas() {
		return camisas;
	}
	public int getSudaderas() {
		return sudaderas;
	}

}
