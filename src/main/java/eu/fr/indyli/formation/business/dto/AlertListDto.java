package eu.fr.indyli.formation.business.dto;

import java.util.List;

import eu.fr.indyli.formation.business.entity.Alerte;

public class AlertListDto {
	private List<Alerte> alerts;
	
	
	public AlertListDto() {
	}
	
	public AlertListDto(List<Alerte> alerts) {
		super();
		this.alerts = alerts;
	}

	public List<Alerte> getAlerts() {
		return alerts;
	}

	public void setAlerts(List<Alerte> alerts) {
		this.alerts = alerts;
	}
}
