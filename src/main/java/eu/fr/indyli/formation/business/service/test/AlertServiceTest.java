package eu.fr.indyli.formation.business.service.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import eu.fr.indyli.formation.business.dto.AlertListDto;
import eu.fr.indyli.formation.business.ecolis.exception.EcolisBusinessException;
import eu.fr.indyli.formation.business.entity.Alerte;
import eu.fr.indyli.formation.business.service.IAlerteService;
import eu.fr.indyli.formation.business.utils.EcolisConstantesBusiness;

public class AlertServiceTest {

	private Service service;
	

	@Before
	public void initService() throws MalformedURLException {
		URL url = new URL(EcolisConstantesBusiness.URL_ALERTE_PATH);
		QName qname = new QName(EcolisConstantesBusiness.TARGET_NAMESPACE, EcolisConstantesBusiness.ALERTE_SERVICE_NAME);
		this.service = Service.create(url, qname);
	}

	@Test
	public void testGetAllAlertes() throws EcolisBusinessException {
		IAlerteService alertSoapService = service.getPort(IAlerteService.class);
		AlertListDto alertList = alertSoapService.findAllAlerts();
		Assert.assertTrue(alertList.getAlerts().size() > 0);
		System.out.println("List ==>" + alertList);
	}

	@Test
	public void testGetAlertById() throws EcolisBusinessException {
		// Given
		Long foundAlertId = 2L;
		IAlerteService userSoapService = service.getPort(IAlerteService.class);
		Alerte alerte = userSoapService.findAlertById(foundAlertId);
		System.out.println(alerte);
		Assert.assertTrue(alerte != null);
		System.out.println("Alerte  ==>" + alerte);
	}

	@Test
	public void testAddAlert() throws EcolisBusinessException {
		IAlerteService userSoapService = service.getPort(IAlerteService.class);
		Alerte alerte= new Alerte(null, "Londres-Uk", "Munich-Allemagne", new Date());
		userSoapService.createAlert(alerte);
		Assert.assertNotNull(alerte.getIdAlerte());
	}
	
}
