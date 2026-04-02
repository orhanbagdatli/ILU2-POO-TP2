package frontiere;

import java.util.Iterator;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infosMarche = controlAfficherMarche.donnerInfosMarche();
		if (infosMarche.length == 0) {
			System.out.println("Le marché est vide, revenez plus tard");
		}
		else {
			System.out.println(nomAcheteur + ", vous trouverez au marché.");
			String vendeur = infosMarche[0];
			String quantite = infosMarche[1];
			String produit = infosMarche[2];
			System.out.println("- " + vendeur + " qui vend " + quantite + "" + produit);
			
				
			
		}
	}
}
