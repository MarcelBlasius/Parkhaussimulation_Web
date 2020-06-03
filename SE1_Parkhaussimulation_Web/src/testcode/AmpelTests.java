package testcode;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import produktionscode.Ampel;
import produktionscode.Parkhaus;


public class AmpelTests {
	private Ampel A;
	private Parkhaus P;
	
	@BeforeEach
	private void setUp () throws Exception {
		P = new Parkhaus(30,0,0);
		A = new Ampel(10, 20, P);
	}
	@Test
	@DisplayName("Farbe wird richtig ausgegeben")
	void TestgetFarbe() {
		assertEquals(A.getFarbe(P),"Gr�n");
	}
	@Test
	@DisplayName("Grenze wird richtig geaendert")
	void TestGrenzeAendern() throws Exception {
		A.SetFarbeGrenze(30, 100);
		assertEquals(A.getFarbe(P),"Gelb");
	}
	@Test
	@DisplayName("Gelb groesser Gruen")
	void TestGelbGroesserGruen() {
		Assertions.assertThrows(Exception.class, () -> {
			A.SetFarbeGrenze(100, 5);
		  });
		
	}
}