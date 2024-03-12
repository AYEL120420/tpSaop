package eu.fr.indyli.formation.business.service.impl;

import java.util.List;

import javax.jws.WebService;

import eu.fr.indyli.formation.business.dao.IAlerteDAO;
import eu.fr.indyli.formation.business.dao.impl.AlerteDAOImpl;
import eu.fr.indyli.formation.business.dto.AlertListDto;
import eu.fr.indyli.formation.business.ecolis.exception.EcolisBusinessException;
import eu.fr.indyli.formation.business.entity.Alerte;
import eu.fr.indyli.formation.business.service.IAlerteService;
import eu.fr.indyli.formation.business.utils.EcolisConstantesBusiness;

@WebService(serviceName = EcolisConstantesBusiness.ALERTE_SERVICE_NAME, endpointInterface = "eu.fr.indyli.formation.business.service.IAlerteService")
public class AlerteServiceImpl implements IAlerteService {


	private IAlerteDAO alertDAO = null;

	public AlerteServiceImpl() throws EcolisBusinessException {
		this.alertDAO = new AlerteDAOImpl();
	}

	
	@Override
	public AlertListDto findAllAlerts() throws EcolisBusinessException {
		List<Alerte> alertes = this.alertDAO.findAll();
		AlertListDto alertListDto = new AlertListDto(alertes);
		return alertListDto;
	}

	@Override
	public Alerte findAlertById(Long idAlerte) throws EcolisBusinessException {
		Alerte alert = this.alertDAO.findById(idAlerte);		
		return alert;
	}

	@Override
	public Long createAlert(Alerte newAlerte) throws EcolisBusinessException {
		Long newAlertId = this.alertDAO.createEntity(newAlerte); 
		return newAlertId;
	}

	@Override
	public void deleteAlert(Alerte alerte) throws EcolisBusinessException {
		this.alertDAO.deleteEntityById(alerte.getIdAlerte());	
	}


	@Override
	public Alerte editAlerte(Long id, String villeDepart, String villeArrive) throws EcolisBusinessException {
		 Alerte updatedAlerte = alertDAO.editEntityAlert(id, villeArrive, villeDepart);
		return updatedAlerte;
	}

	

}
