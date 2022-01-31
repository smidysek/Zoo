package pack;

import java.time.LocalDate;

public class Savec extends Zvire{
	final boolean TEPLOKREVNOST = true;
	int telesnaTeplota;
	
	public Savec(LocalDate datumNarozeni, String jmeno, boolean zijuVCesku, int telesnaTeplota) {
		super(datumNarozeni, jmeno, zijuVCesku);
		this.telesnaTeplota = telesnaTeplota;
	}
	
	public void vydejZvuk(String citoslovce) {
		System.out.println(citoslovce);
	}
	
	
	
}
