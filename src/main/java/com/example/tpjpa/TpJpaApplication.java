package com.example.tpjpa;

//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.tpjpa.entities.Patient;
import com.example.tpjpa.repositories.PatientRepository;

@SpringBootApplication
public class TpJpaApplication implements CommandLineRunner {
	@Autowired
	
	private PatientRepository patientRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(TpJpaApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception {
//		patientRepository.save(new Patient(null, "Hassan",new Date(), 2300, false));
//		patientRepository.save(new Patient(null, "Farah",new Date(), 1400, false));
//		patientRepository.save(new Patient(null, "Imane",new Date(), 1000, false));
//		patientRepository.save(new Patient(null, "Yassine",new Date(), 1800 , true));
		
//		System.out.println("*****************************************");
//		patientRepository.findAll().forEach(p->{
//			System.out.println(p.toString());
//		});			
////		System.out.println("*****************************************");
////		List<Patient> patients=patientRepository.findByNomContains("s");
////		patients.forEach(p->{
////			System.out.println(p.getNom());
////		});
//		System.out.println("*****************************************");
//		List<Patient> malade=patientRepository.findByMalade(true);
//		malade.forEach(p->{
//			System.out.println(p.getNom());
//		});
//		System.out.println("*****************************************");
//		List<Patient> containsmalade=patientRepository.findByNomContainsAndMalade("a", false);
//		containsmalade.forEach(p->{
//			System.out.println(p.getNom());
//		});
	}
}
