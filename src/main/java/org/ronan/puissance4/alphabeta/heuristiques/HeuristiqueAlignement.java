package org.ronan.puissance4.alphabeta.heuristiques;

import org.ronan.puissance4.alphabeta.Heuristique;
import org.ronan.puissance4.modele.jeu.Grille;
import org.ronan.puissance4.modele.joueur.Joueur;
import org.ronan.puissance4.modele.partie.Partie;



/**
 * Cette heuristique compte le nombre d'alignement pour un joueur donn� et donne la note suivante. Elle pr�vient �galement la d�faite 
 * en checkant les alignements de l'adversaire
 * 
 * 2 Jetons = 1 point
 * 3 Jetons = 3 points
 * 4 Jetons = 9 points
 * @author Ronan Quintin
 *
 */
public class HeuristiqueAlignement extends Heuristique{

	@Override
	public double noteGrille(Grille grille, Joueur joueur) {
		
		
		
		if(grille.chercheAlignementDeJeton(Partie.TAILLE_ALIGNEMENT_POUR_VICTOIRE, Partie.getPartie().joueurSuivant(joueur).getCouleur())){
			return Heuristique.MIN_NOTE;
		}
		
		if(grille.chercheAlignementDeJeton(Partie.TAILLE_ALIGNEMENT_POUR_VICTOIRE, joueur.getCouleur())){
			return Heuristique.MAX_NOTE;
		}
		

		
		int score2Jetons = grille.compteAlignementDeJeton(2, joueur.getCouleur());
		int score3Jetons = 3 * grille.compteAlignementDeJeton(3, joueur.getCouleur());;
		int score4Jetons = 9 * grille.compteAlignementDeJeton(4, joueur.getCouleur());;
		
		return score2Jetons + score3Jetons + score4Jetons;
	}

}
