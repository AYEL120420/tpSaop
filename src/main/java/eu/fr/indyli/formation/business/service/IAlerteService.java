package eu.fr.indyli.formation.business.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import eu.fr.indyli.formation.business.dto.AlertListDto;
import eu.fr.indyli.formation.business.ecolis.exception.EcolisBusinessException;
import eu.fr.indyli.formation.business.entity.Alerte;

@WebService //exposer les méthodes
@SOAPBinding(style = Style.RPC)
public interface IAlerteService {

	
	public AlertListDto findAllAlerts() throws EcolisBusinessException;
	
	public Alerte findAlertById(Long idAlerte) throws EcolisBusinessException;
	
	public Long createAlert(Alerte newAlerte) throws EcolisBusinessException;
	
	public void deleteAlert(Alerte alerte) throws EcolisBusinessException;
	
	public Alerte editAlerte(Long id, String villeDepart, String villeArrive) throws EcolisBusinessException;
}
