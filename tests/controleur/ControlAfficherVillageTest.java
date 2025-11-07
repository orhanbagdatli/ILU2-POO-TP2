package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlAfficherVillageTest {
	private ControlAfficherVillage ca;
	private ControlEmmenager cm;
	
	
	

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("Le village", 10, 5);
		ca = new ControlAfficherVillage(village);
		village.setChef(new Chef("Chef", 1, village));
		cm = new ControlEmmenager(village);
		
	}
	
	@Test
	void testNbEtals() {
		assertEquals(5, ca.donnerNbEtals());
	}
	
	@Test
	void testNomVillage() {
		assertEquals("Le village", ca.donnerNomVillage());
	}
	
	@Test
	void testNomsVillageois() {
		cm.ajouterGaulois("Bonemine", 1);
		cm.ajouterGaulois("Obelix", 1);
		assertEquals(3, ca.donnerNomsVillageois().length);
		assertArrayEquals(new String[] { "Chef", "Bonemine", "Obelix" }, ca.donnerNomsVillageois());
		
		String[] noms = ca.donnerNomsVillageois();
	}

}
