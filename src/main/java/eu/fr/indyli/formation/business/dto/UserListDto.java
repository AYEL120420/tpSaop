package eu.fr.indyli.formation.business.dto;

import java.util.List;

import eu.fr.indyli.formation.business.entity.Utilisateur;

public class UserListDto {

	private List<Utilisateur> users;
	
	public UserListDto() {
	}
	
	public UserListDto(List<Utilisateur> users) {
		super();
		this.users = users;
	}

	public List<Utilisateur> getUsers() {
		return users;
	}

	public void setUsers(List<Utilisateur> users) {
		this.users = users;
	}
}
