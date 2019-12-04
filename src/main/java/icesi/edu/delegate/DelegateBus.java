package icesi.edu.delegate;

import org.springframework.stereotype.Component;

import icesi.edu.model.Tmio1Bus;
import icesi.edu.rest.BusRest;

@Component
public class DelegateBus {

	private BusRest busRest;

	public Tmio1Bus findById(Tmio1Bus tmio1Bus) {
		return busRest.findById(tmio1Bus);
	}

}
