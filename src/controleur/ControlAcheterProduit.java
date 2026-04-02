package controleur;

import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}
	public Etal acheterProduit(String nom) {
		boolean identite = controlVerifierIdentite.verifierIdentite(nom);
		if (identite) {
			return controlTrouverEtalVendeur.trouverEtalVendeur(nom);
			
		}
		return null;
		
	}
	
}
