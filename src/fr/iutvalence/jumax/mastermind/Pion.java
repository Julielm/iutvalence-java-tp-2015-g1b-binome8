package fr.iutvalence.jumax.mastermind;
/**
 * pion coloré
 * @author jumax
 */
public class Pion
{
	/**
	 * La couleur du pion
	 */
	private final int couleur;
	
	/**
	 * Construire un pion de couleur donnée
	 * @param couleur
	 *          	la couleur voulue
	 */
	public Pion(int couleur)
	{
		this.couleur=couleur;
	}
	
	/**
	 * Obtenir la couleur du pion
	 */
	public int obtenirCouleur()
	{
		return couleur;
	}
	

}
