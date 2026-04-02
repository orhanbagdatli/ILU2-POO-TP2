package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlVerifierIdentiteTest {
	private ControlVerifierIdentite cv;
	private ControlEmmenager cm;
	private ControlAfficherVillage ca;
	

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("Le village", 10, 5);
		cv = new ControlVerifierIdentite(village);
		village.setChef(new Chef("Chef", 1, village));
		cm = new ControlEmmenager(village);
		ca = new ControlAfficherVillage(village);
	}

	@Test
	void testVerifierIdentite() {
		cm.ajouterGaulois("Bonemine", 1);
		cm.ajouterGaulois("Obelix", 1);
		assertTrue()
	}

}
