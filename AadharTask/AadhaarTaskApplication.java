package com.hughes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.hughes.model.Aadhar;
import com.hughes.services.AadharService;

@SpringBootApplication
public class AadhaarTaskApplication implements CommandLineRunner {

	@Autowired
	AadharService adService;

	public static void main(String[] args) {
		SpringApplication.run(AadhaarTaskApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// TODO Auto-generated method stub

		// CREATE
//		Aadhar ad = new Aadhar();
//		ad.setAadharNo(888888L);
//		ad.setCitizenName("Vishesh");
//		ad.setMobileNo(777777L);
//		ad.setAddress("Ghaziabad");
//		ad.setIncome(10000);
//		ad.setState("UP");
//		System.out.println(adService.create(ad));

		// READALL
//		for (Aadhar obj : adService.readAll()) {
//			System.out.println("Aadhar No: " + obj.getAadharNo() + ", Citizen Name: " + obj.getCitizenName()
//					+ ", Mobile No: " + obj.getMobileNo() + ", Address: " + obj.getAddress() + ", Income: "
//					+ obj.getIncome() + ", State: " + obj.getState());
//		}

		// READ BY ID
//		Optional<Aadhar> ad = adService.readById(123456789L);
//		System.out.println(ad.get().getCitizenName());
		
		//Update
//		Aadhar ad = new Aadhar();
//		ad.setIncome(20000);
//		ad.setAadharNo(123456789L);
//		System.out.println(adService.update(ad));
		
		//Delete
//		System.out.println(adService.delete(888888L));
				
		
		

	}

}
