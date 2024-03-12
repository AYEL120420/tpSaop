package eu.fr.indyli.formation.business.service.publisher;

/**
 * 
 * @author CHZOME
 *
 */

import javax.xml.ws.Endpoint;

import eu.fr.indyli.formation.business.ecolis.exception.EcolisBusinessException;
import eu.fr.indyli.formation.business.service.impl.AlerteServiceImpl;
import eu.fr.indyli.formation.business.service.impl.UtilisateurServiceImpl;
import eu.fr.indyli.formation.business.utils.EcolisConstantesBusiness;

public class EcolisServicePublisher {

	public static void main(String[] args) throws EcolisBusinessException {

		System.out.println("Beginning to publish Gesta Service now");
		//Endpoint.publish("http://" + EcolisConstantesBusiness.SERVER_IP + ":" + EcolisConstantesBusiness.SERVER_PORT
		//+ "/ecolis/users", new UtilisateurServiceImpl());	
		//System.out.println("Users Done publishing...");
		
	Endpoint.publish("http://" + EcolisConstantesBusiness.SERVER_IP + ":" + EcolisConstantesBusiness.SERVER_PORT+ "/ecolis/alerts", new AlerteServiceImpl());
	System.out.println("Alerts Done publishing...");
	}
}
