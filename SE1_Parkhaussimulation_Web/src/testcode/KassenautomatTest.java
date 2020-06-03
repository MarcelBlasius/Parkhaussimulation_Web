package testcode;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produktionscode.Kassenautomat;

class KassenautomatIFTest {

	
	private Kassenautomat k;
	
	@BeforeEach
	private void setUp () {
		k = new Kassenautomat(1.6f);
	}
	
	
	
	@Test
	@DisplayName("Preis kann nachtr�glich angepasst werden")
	void testSetPrize() {
		k.setPrize(1.6f);
		assertEquals(1.6f,k.getPrize(),0.0001);
	}

	@Test
	@DisplayName("Preis f�r den Parkhausaufenthalt wird korrekt berechnet")
	void testCalculatePrize() {
		assertEquals(3.2f,k.calculatePrize(2.0f),0.0001);
	}

}