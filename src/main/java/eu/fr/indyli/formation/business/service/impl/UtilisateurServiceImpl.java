package eu.fr.indyli.formation.business.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.apache.commons.lang3.StringUtils;

import eu.fr.indyli.formation.business.dao.IUtilisateurDAO;
import eu.fr.indyli.formation.business.dao.impl.UtilisateurDAOImpl;
import eu.fr.indyli.formation.business.dto.UserListDto;
import eu.fr.indyli.formation.business.ecolis.exception.EcolisBusinessException;
import eu.fr.indyli.formation.business.entity.Utilisateur;
import eu.fr.indyli.formation.business.service.IUtilisateurService;
import eu.fr.indyli.formation.business.utils.EcolisConstantesBusiness;

@WebService(serviceName = EcolisConstantesBusiness.USER_SERVICE_NAME, endpointInterface = "eu.fr.indyli.formation.business.service.IUtilisateurService")
public class UtilisateurServiceImpl implements IUtilisateurService {

	private IUtilisateurDAO userDAO = null;

	public UtilisateurServiceImpl() {
		this.userDAO = new UtilisateurDAOImpl();
	}

	@Override
	public Utilisateur findByEmailAndPassword(String email, String password) throws EcolisBusinessException {
		if (StringUtils.isBlank(email) || StringUtils.isBlank(password)) {
			throw new EcolisBusinessException("VOUS DEVEZ RENSEINGER LES 2 CHAMPS");
		}
		return userDAO.findByEmailAndPassword(email, password);
	}

	@Override
	public ArrayList<Utilisateur> findAuthorsCommentByDateAndPostedAnnonce(Date paramDatePivot,
			String paramVilleArrivee) throws EcolisBusinessException {
		if (StringUtils.isBlank(paramVilleArrivee) || paramDatePivot == null) {
			throw new EcolisBusinessException("VOUS DEVEZ RENSEINGER LES 2 CHAMPS");
		}
		return userDAO.findAuthorsCommentByDateAndPostedAnnonce(paramDatePivot, paramVilleArrivee);
	}

	@Override
	public Utilisateur findByEmail(String email) throws EcolisBusinessException {
		if (StringUtils.isBlank(email))
			throw new EcolisBusinessException("VOUS DEVEZ RENSEINGER L'EMAIL");
		return this.userDAO.findByEmail(email);
	}

	@Override
	public UserListDto findAll() {
		List<Utilisateur> userList = this.userDAO.findAll();
		UserListDto userListDto = new UserListDto(userList);
		return userListDto;
	}

	@Override
	public Utilisateur findById(Long id) throws EcolisBusinessException {
		Utilisateur utilisateur = this.userDAO.findById(id);
		return utilisateur;
	}

	@Override
	public Long createUser(Utilisateur user) throws EcolisBusinessException {
		Long newUserId = this.userDAO.createEntity(user);
		return newUserId;
	}

}
