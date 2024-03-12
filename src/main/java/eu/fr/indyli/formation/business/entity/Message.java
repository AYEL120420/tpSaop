package eu.fr.indyli.formation.business.entity;
// Generated 25 juin 2017 02:21:10 by Hibernate Tools 5.2.0.CR1

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Message generated by hbm2java
 */
public class Message extends AbstractEcolisEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5315428355602942960L;
	private Integer idMessage;
	private Annonce annonce;
	private Utilisateur utilisateur;
	private String corps;
	private Date dateCreation;

	public Message() {
	}

	public Message(Annonce annonce, Date dateCreation) {
		this.annonce = annonce;
		this.dateCreation = dateCreation;
	}

	public Message(Annonce annonce, Utilisateur utilisateur, String corps, Date dateCreation) {
		this.annonce = annonce;
		this.utilisateur = utilisateur;
		this.corps = corps;
		this.dateCreation = dateCreation;
	}

	public Integer getIdMessage() {
		return this.idMessage;
	}

	public void setIdMessage(Integer idMessage) {
		this.idMessage = idMessage;
	}

	public Annonce getAnnonce() {
		return this.annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getCorps() {
		return this.corps;
	}

	public void setCorps(String corps) {
		this.corps = corps;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this); 
	}

}
