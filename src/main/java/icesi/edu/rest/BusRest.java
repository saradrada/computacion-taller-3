package icesi.edu.rest;

import icesi.edu.model.Tmio1Bus;
import icesi.edu.services.BusService;

public class BusRest {

	private BusService service;
	
	public Tmio1Bus findById(Tmio1Bus tmio1Bus) {
		return service.findById(tmio1Bus.getId());
	}
	
}
