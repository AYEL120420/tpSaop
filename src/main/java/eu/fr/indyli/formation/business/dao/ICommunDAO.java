package eu.fr.indyli.formation.business.dao;

import java.util.List;

import eu.fr.indyli.formation.business.ecolis.exception.EcolisBusinessException;
import eu.fr.indyli.formation.business.entity.Alerte;

public interface ICommunDAO<E> {

	/**
	 * Retourne la liste des entit�s
	 * @return
	 */
	public List<E> findAll();
	/**
	 * Retourne une entite  par son identifiant
	 * @param id : Identifiant pour lequel on souhaite retourner l'entit�
	 * @return
	 * @throws EcolisBusinessException
	 */
	public E findById(Long id) throws EcolisBusinessException;
	/**
	 * Permet de cr�er une nouvelle entit�
	 * @param ent
	 * @return
	 * @throws EcolisBusinessException
	 */
	public Long createEntity(E ent) throws EcolisBusinessException;
	/**
	 * Permet de supprimer une entit� par son identifiant
	 * @param id : Identifiant de l'entit� � supprimer
	 * @throws EcolisBusinessException
	 */
	public void deleteEntityById(Long id) throws EcolisBusinessException;

}
