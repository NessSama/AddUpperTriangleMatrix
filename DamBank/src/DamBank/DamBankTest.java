package DamBank;

import org.junit.jupiter.api.Test;

class DamBankTest {

	String[] iban;
	String[] holderName;
	String[] holderSurname;
	int[] option;
	int[] quantity;
	
	@Test
	public void test() {
		iban = new String[] {"ES6621000418401234567891", "ES2500814215425256562325", "ES5821006024160200068606"};
		holderName = new String[] {"Pepe", "Nu�o", ""};
		holderSurname = new String[] {"�lvarez Garc�a", "L�pez Suarez", ""}; 
		
		option = new int[] {1, 3, 7, 10};
		quantity = new int[] {12, 3001, -12, 7};
	}

}
