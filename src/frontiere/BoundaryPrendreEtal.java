//package frontiere;
//
//import controleur.ControlPrendreEtal;
//
//public class BoundaryPrendreEtal {
//	private ControlPrendreEtal controlPrendreEtal;
//
//	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
//		this.controlPrendreEtal = controlChercherEtal;
//	}
//
//	public void prendreEtal(String nomVendeur) {
//		boolean estHabitant = controlPrendreEtal.verifierIdentite(nomVendeur);
//		 if (!estHabitant) {
//	            System.out.println("Je suis désolée " + nomVendeur
//	                    + " mais il faut être un habitant de notre village pour commercer ici.");
//	            return;
//	        }
//		 else {
//			System.out.println("Bonjour " + nomVendeur
//                    + ", je vais regarder si je peux vous trouver un étal.");
//			boolean etalDisponible = controlPrendreEtal.resteEtals();
//			
//			if (!etalDisponible) {
//				System.out.println("Désolé " + nomVendeur
//                        + ", je n'ai plus d'étal qui ne soit pas déjà occupé.");
//			}
//			else {
//				installerVendeur(nomVendeur);
//			}
//		}
//	}
//
//	private void installerVendeur(String nomVendeur) {
//		System.out.println("C'est parfait, il me reste un étal pour vous !");
//        System.out.println("Il me faudrait quelques renseignements :");
//        String produit = Clavier.entrerChaine("Quel produit souhaitez-vous vendre ?");
//        int nbProduit = Clavier.entrerEntier("Combien souhaitez-vous en vendre ?");
//        
//        int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
//        if (numeroEtal!=-1) {
//        	System.out.println("Le vendeur " + nomVendeur
//                    + " s'est installé à l'étal n°" + (numeroEtal + 1));
//		}
//	}
//}

package frontiere;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		
		if(!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println("Je suis desolée " + nomVendeur + " mais il faut être un habitant de notre village pour commercer ici.");
			
		}
		else {
			System.out.println("Bonjour " + nomVendeur + ", je vais regarder si je peux vous trouver un étal.");
			boolean etalDisponible = controlPrendreEtal.resteEtals();
			if (!etalDisponible) {
				
				System.out.println("Desolée " + nomVendeur + " je n'ai plus d'étal qui ne soit pas deja occupé.");	
			}
			else {
				installerVendeur(nomVendeur);
			}

		}
	}

	private void installerVendeur(String nomVendeur) {
		
		System.out.println("C'est parfait il me reste un étal pour vous !");
		System.out.println("Il me faudrait quelques renseignements :");
		String produit = Clavier.entrerChaine("Quel produit souhaitez-vous vendre ?");
		int nbProduit = Clavier.entrerEntier("Combien souhaitez-vous en vendre ?");
		int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		if (numeroEtal!=-1) {
			System.out.println("Le vendeur " + nomVendeur + " s'est installé à l'etal n°" + numeroEtal);
		}
	}
}
