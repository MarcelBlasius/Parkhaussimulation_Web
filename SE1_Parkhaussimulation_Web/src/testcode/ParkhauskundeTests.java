package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produktionscode.Parkhauskunde;
import produktionscode.Tageskunde;

class ParkhauskundeTests {
	
	
	@BeforeEach
	void setUp(){
	}

	@Test
	@DisplayName("Einfahren des Kunden")
	void testeinfahren() {
		Parkhauskunde p = new Tageskunde();
		p.einfahren();
		assert(p.getEinfahrtszeit() != null);
	}
	
	
	@Test
	@DisplayName("Ausfahren des Kunden")
	void testausfahren() {
		Parkhauskunde p = new Tageskunde();
		p.einfahren();
		p.ausfahren();
		assertEquals(null, p.getEinfahrtszeit());
		
	}

}