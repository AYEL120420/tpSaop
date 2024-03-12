package eu.fr.indyli.formation.business.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import eu.fr.indyli.formation.business.dao.IUtilisateurDAO;
import eu.fr.indyli.formation.business.ecolis.exception.EcolisBusinessException;
import eu.fr.indyli.formation.business.entity.Alerte;
import eu.fr.indyli.formation.business.entity.Utilisateur;

/**
 * 
 * @author CHZOME
 *
 */
public class UtilisateurDAOImpl implements IUtilisateurDAO{

	
	private List<Utilisateur> userList = null;
	
	//public Utilisateur(String civilite, String email, int anneeDeNaissance,String name,String firstname,String password)
	public UtilisateurDAOImpl(){
		Utilisateur user1 = new Utilisateur("Monsieur","czo@yahoo.fr",1990,"ZOME","Christophe","czo_pwd");
		Utilisateur user2 = new Utilisateur("Madame","ludivine.haller@interlab.fr",1995,"HALLER","Ludivine","hal_pwd");
		Utilisateur user3 = new Utilisateur(10L,"Monsieur","nicolas.sarkozy@gouv.fr",1995,"Sarkozy","Nicolas","nico_sarko");
		this.userList = new ArrayList<Utilisateur>();
		this.userList.add(user1);
		this.userList.add(user2);
		this.userList.add(user3);
	}
	
	@Override
	public Utilisateur findByEmailAndPassword(String email, String password) {
		for (Utilisateur utilisateur : this.userList) {
			if (utilisateur.getEmail().equals(email) && utilisateur.getPassword().equals(password)){
				return utilisateur;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Utilisateur> findAuthorsCommentByDateAndPostedAnnonce(Date paramDatePivot, String paramVilleArrivee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur findByEmail(String email) {
		for (Utilisateur utilisateur : this.userList) {
			if (utilisateur.getEmail().equals(email)){
				return utilisateur;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Utilisateur> getUtilisateurParDomaineEtPossedantTel(String domaineP) throws EcolisBusinessException {
		ArrayList<Utilisateur>  result = new ArrayList<Utilisateur>();
		for (Utilisateur utilisateur : this.userList) {
			if (utilisateur.getEmail().endsWith(domaineP)){
				result.add(utilisateur);
			}
		}
		return result;
	}

	@Override
	public List<Utilisateur> findAll() {
		return this.userList;
	}

	@Override
	public Utilisateur findById(Long userId) throws EcolisBusinessException {
		for (Utilisateur utilisateur : userList) {
			if (utilisateur.getIdUtilisateur().equals(userId)){
				return utilisateur;
			}
		}
		return null;
	}

	@Override
	public Long createEntity(Utilisateur ent) throws EcolisBusinessException {
		ent.setIdUtilisateur(System.currentTimeMillis());
		this.userList.add(ent);
		return ent.getIdUtilisateur();
	}

	@Override
	public void deleteEntityById(Long id) throws EcolisBusinessException {
		Utilisateur userToDelete = this.findById(id);
		if (userToDelete != null){
			this.userList.remove(userToDelete);
		}
	}



	
}
