package pack;

import java.time.LocalDate;

public class Krokodyl extends Plaz{
	int telesnaTeplota;
	
	public Krokodyl(LocalDate datumNarozeni, String jmeno, boolean zijuVCesku, int telesnaTeplota) {
		super(datumNarozeni, jmeno, zijuVCesku);
		this.telesnaTeplota = telesnaTeplota;
	}

}
