package pack;

import java.time.LocalDate;

public class Zelva extends Plaz{
	int telesnaTeplota;

	public Zelva(LocalDate datumNarozeni, String jmeno, boolean zijuVCesku, int telesnaTeplota) {
		super(datumNarozeni, jmeno, zijuVCesku);
		this.telesnaTeplota = telesnaTeplota;
	}
}
