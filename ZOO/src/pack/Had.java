package pack;

import java.time.LocalDate;

public class Had extends Plaz{
	int telesnaTeplota;
	
	public Had(LocalDate datumNarozeni, String jmeno, boolean zijuVCesku, int telesnaTeplota) {
		super(datumNarozeni, jmeno, zijuVCesku);
		this.telesnaTeplota = telesnaTeplota;
	}
}
