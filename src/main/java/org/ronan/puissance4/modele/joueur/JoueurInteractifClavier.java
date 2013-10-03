/**
 * 
 */
package org.ronan.puissance4.modele.joueur;

import java.util.Scanner;

import org.ronan.puissance4.modele.jeu.Grille;
import org.ronan.puissance4.modele.jeu.couleur.Couleur;

/**
 * Un joueur interactif au clavier demande � l'utilisateur de saisir la colonne dans laquelle placer son jeton 
 * @author Ronan Quintin
 *
 */
public class JoueurInteractifClavier extends Joueur {

	public JoueurInteractifClavier(Couleur couleur) {
		super(couleur);
	}

	/* (non-Javadoc)
	 * @see org.ronan.puissance4.modele.joueur.Joueur#placerJeton(org.ronan.puissance4.modele.jeu.Grille)
	 */
	@Override
	public int placerJeton(Grille grille,Joueur joueur, Joueur opposant) {
		System.out.print("O� placer le prochain jeton? Donnez un num�ro de colonne entre 1 et " + Grille.LARGEUR_GRILLE + " : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();


		return i;
	}

}
