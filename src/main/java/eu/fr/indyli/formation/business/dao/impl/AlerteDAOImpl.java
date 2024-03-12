package eu.fr.indyli.formation.business.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import eu.fr.indyli.formation.business.dao.IAlerteDAO;
import eu.fr.indyli.formation.business.ecolis.exception.EcolisBusinessException;
import eu.fr.indyli.formation.business.entity.Alerte;

public class AlerteDAOImpl implements IAlerteDAO{

	
	private List<Alerte> alerteList;
    private AtomicLong idCounter;

    public AlerteDAOImpl() throws EcolisBusinessException {
        this.alerteList = new ArrayList<>();
        this.idCounter = new AtomicLong(0); // Initialisation du compteur
        
        // Création et ajout des alertes initiales avec des ID uniques
        this.createEntity(new Alerte(null, "Douala-Cameroun", "Paris-France", new Date()));
        this.createEntity(new Alerte(2L, null, "Rennes-France", "Nice-France", new Date()));
        this.createEntity(new Alerte(null, "Bruxelles-Belgique", "Munich-Allemagne", new Date()));
        this.createEntity(new Alerte(null, "Budapest-Hongrie", "New-York-USA", new Date()));
    }

	@Override
	public List<Alerte> findAll() {
		return this.alerteList;
	}

	@Override
	public Alerte findById(Long id) throws EcolisBusinessException {
		for (Alerte alerte : alerteList) {
			if (alerte.getIdAlerte().equals(id)){
				return alerte;
			}
		}
		return null;
	}

	@Override
	public Long createEntity(Alerte ent) throws EcolisBusinessException {
		 long newId = idCounter.incrementAndGet();
	        ent.setIdAlerte(newId);
		this.alerteList.add(ent);
		return ent.getIdAlerte();
		}

	@Override
	public void deleteEntityById(Long id) throws EcolisBusinessException {
	 Alerte alertToDelete = this.findById(id);
	 if (alertToDelete != null) {
		 this.alerteList.remove(alertToDelete);
	 }
	}

	@Override
	public List<Alerte> findByVilleDepart(String villeDep) {
		return this.alerteList;
	}

	@Override
	public Alerte editEntityAlert(Long id, String villeArrive, String villeDepart) throws EcolisBusinessException{
		Alerte alertToUpdate = findById(id);
		if (alertToUpdate!=null){
			alertToUpdate.setVilleArrivee(villeArrive);
			alertToUpdate.setVilleDepart(villeDepart);
			return alertToUpdate;
		}
		throw new EcolisBusinessException("Aucune alerte trouvée avec l'id: " +	id);	
		
	}
}
