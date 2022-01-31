package com.taxitracker;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.taxitracker.dao.*;
import com.taxitracker.dto.*;

@SpringBootApplication
public class TaxiTrackerApplication {
	//jdbc:h2:mem:testdb
	
	@Autowired
	private DriverRepository driverRepo;
	@Autowired
	private AreaRepository areaRepo;
	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private OrderRepository orderRepo;
	@Autowired
	private ReviewRepository reviewRepo;
	@Autowired
	private StatusRepository statusRepo;
	@Autowired
	private TransactionRepository transactionRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TaxiTrackerApplication.class, args);
	}
	
	@Bean
	InitializingBean sendDatabase() {
	    return () -> {
	    	areaRepo.save(new AreaDTO("Zagreb Centar", 5.0, "45.81313,15.97753"));
	    	areaRepo.save(new AreaDTO("Sesvete", 2.5, "45.83111,16.11639"));
	    	areaRepo.save(new AreaDTO("Dugo Selo", 3.1, "45.81024,15.24317"));
	    	areaRepo.save(new AreaDTO("Vrbovec", 2.1, "45.80413,15.11023"));
	    	areaRepo.save(new AreaDTO("Križevci", 3.4, "46.02194,16.5425"));
	    	areaRepo.save(new AreaDTO("Koprivnica", 4.0, "46.16278,16.8275"));
	    	
	    	customerRepo.save(new CustomerDTO(1, "Ivan", "Horvat", "ihvt@mail.com", "123456"));
	    	customerRepo.save(new CustomerDTO(2, "Josip", "Knežević", "jskn@mail.com", "password"));
	    	customerRepo.save(new CustomerDTO(3, "Marko", "Kovačević", "mkkv@mail.com", "123456"));
	    	customerRepo.save(new CustomerDTO(4, "Josip", "Kovačević", "joko@mail.com", "abc123"));
	    	customerRepo.save(new CustomerDTO(5, "Ivan", "Horvat", "ihtv@gmail.com", "111111"));

	    	driverRepo.save(new DriverDTO(1, "Tomislav", "Horvat", "tohv@mail.com", "123456", 15.2));
	    	driverRepo.save(new DriverDTO(2, "Tonči", "Knežević", "tnkn@mail.com", "password", 9.5));
	    	driverRepo.save(new DriverDTO(3, "Tihomir", "Kovačević", "thkv@mail.com", "123456", 6.3));
	    	driverRepo.save(new DriverDTO(1, "Tvtko", "Kovačević", "ttko@mail.com", "abc123", 15.2));
	    	driverRepo.save(new DriverDTO(5, "Tomo", "Horvat", "tomo@gmail.com", "111111", 4.0));
	    	
	    	orderRepo.save(new OrderDTO(1, 1, "2019-05-24", 15.2, "centar", true));
	    	orderRepo.save(new OrderDTO(1, 1, "2019-05-25", 15.2, "centar", true));
	    	orderRepo.save(new OrderDTO(1, 4, "2019-05-26", 30.4, "centar", true));
	    	orderRepo.save(new OrderDTO(5, 5, "2019-05-10", 4.0, "centar", true));
	    	orderRepo.save(new OrderDTO(3, 3, "2019-05-27", 6.3, "centar", true));
	    	
	    	reviewRepo.save(new ReviewDTO(1, 1, 5.0, "Odlična vožnja", "2019-05-24"));
	    	reviewRepo.save(new ReviewDTO(1, 1, 3.0, "Dobra vožnja", "2019-05-25"));
	    	reviewRepo.save(new ReviewDTO(1, 4, 1.0, "Loša vožnja", "2019-05-26"));
	    	reviewRepo.save(new ReviewDTO(5, 5, 5.0, "Odlična vožnja", "2019-05-10"));
	    	reviewRepo.save(new ReviewDTO(3, 3, 4.0, "Vrlo dobra vožnja", "2019-05-27"));
	    	
	    	statusRepo.save(new StatusDTO(1, "dostupan", "slobodno mogu primiti nove rezervacije", "inf"));
	    	statusRepo.save(new StatusDTO(2, "dostupan", "slobodno mogu primiti nove rezervacije", "inf"));
	    	statusRepo.save(new StatusDTO(3, "nedostupan", "ne mogu primiti nove rezervacije", "5h"));
	    	statusRepo.save(new StatusDTO(4, "nedostupan", "ne mogu primiti nove rezervacije", "15min"));
	    	statusRepo.save(new StatusDTO(5, "dostupan", "slobodno mogu primiti nove rezervacije", "inf"));
	    	
	    	transactionRepo.save(new TransactionDTO(1, "2019-05-24", 15.2));
	    	transactionRepo.save(new TransactionDTO(2, "2019-05-25", 15.2));
	    	transactionRepo.save(new TransactionDTO(3, "2019-05-26", 30.4));
	    	transactionRepo.save(new TransactionDTO(4, "2019-05-10", 4.0));
	    	transactionRepo.save(new TransactionDTO(5, "2019-05-27", 6.3));
	      };
	   }
	
}
