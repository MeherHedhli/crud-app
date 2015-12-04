package fr.esiag.isidis.service;

import static org.assertj.core.api.Assertions.assertThat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import fr.esiag.isidis.data.model.Car;

@RunWith(PowerMockRunner.class)
public class CarServiceTest {

	@Inject
    CarService carService;


    Car car;
    
	@Test
	public void shouldUpdate() {
		// given
		Car carToUpdate = carService.findByExample(car);
		// when
		
		assertThat(car.getId()).isEqualTo(carToUpdate.getId());
	}

	
	
}
