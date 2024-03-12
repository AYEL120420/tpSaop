package eu.fr.indyli.formation.business.service;

import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import eu.fr.indyli.formation.business.dto.UserListDto;
import eu.fr.indyli.formation.business.ecolis.exception.EcolisBusinessException;
import eu.fr.indyli.formation.business.entity.Utilisateur;

/**
 * 
 * @author CHZOME
 *
 */
@WebService //exposer les méthodes
@SOAPBinding(style = Style.RPC) //mapper les rslts en entrée et sortie
public interface IUtilisateurService {

	/**
     * recupere un utilisateur par son login et son password
     * @param login : Login de l'utilisateur qu'on souhaite recuperer
     * @param password : Password de l'utilisateur qu'on souhaite recuperer
     * @return : Utilisateur recherche
     */
	public Utilisateur findByEmailAndPassword(String login,String password) throws EcolisBusinessException ;
    /**
     * Remonte les auteurs de comment postes apres une date et ayant depos� une annonce pour ville arrivee donn�e
     * @param paramDatePivot : Date pivot de depot du commentaire
     * @param paramVilleArrivee : Ville d'arriv�e
     * @return
     */
    public ArrayList<Utilisateur> findAuthorsCommentByDateAndPostedAnnonce(Date paramDatePivot,String paramVilleArrivee) throws EcolisBusinessException;
    /**
     * Recupere un utilisateur par son email
     * @param email
     * @return
     */
    public Utilisateur findByEmail(String email) throws EcolisBusinessException;
    
    /**
     * Recupere un utilisateur par son id
     * @param id : Identifiant de l'utilisateur qu'on souhaite recuperer
     * @return
     * @throws EcolisBusinessException
     */
    public Utilisateur findById(Long id) throws EcolisBusinessException;
    /**
     * Remonte tous les utilisateurs
     * @return
     */
    UserListDto findAll();
	/**
	 * Cree un nouvel utilisateur
	 * @param user  : Utilisateur � cr�er
	 * @return  : Retourne l'identifiant de l'utilisateur en cours de cr�ation
	 * @throws EcolisBusinessException
	 */
	public Long createUser(Utilisateur user) throws EcolisBusinessException;
}
