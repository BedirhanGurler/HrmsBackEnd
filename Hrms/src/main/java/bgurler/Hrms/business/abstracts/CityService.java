package bgurler.Hrms.business.abstracts;

import java.util.List;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.entities.concretes.City;

public interface CityService {
	DataResult<List<City>> getAll();
}
