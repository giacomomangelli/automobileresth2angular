package it.prova.automobileresth2;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.automobileresth2.model.Automobile;
import it.prova.automobileresth2.service.AutomobileService;

@SpringBootApplication
public class Automobileresth2Application implements CommandLineRunner{
	
	@Autowired
	private AutomobileService automobileService;

	public static void main(String[] args) {
		SpringApplication.run(Automobileresth2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		automobileService.save(new Automobile("Fiat", "Tipo", "AB987UI",
				new SimpleDateFormat("dd/MM/yyyy").parse("28/12/2018"), true));
		automobileService.save(new Automobile("Fiat", "500", "HG987UI",
				new SimpleDateFormat("dd/MM/yyyy").parse("28/09/2018"), true));
		automobileService.save(new Automobile("VW", "Golf", "YU547UI",
				new SimpleDateFormat("dd/MM/yyyy").parse("28/12/2018"), true));
		automobileService.save(new Automobile("Opel", "Tigra", "XX127UI",
				new SimpleDateFormat("dd/MM/yyyy").parse("28/12/1998"), false));

		automobileService.save(new Automobile("Fiat", "500", "RR123UI",
				new SimpleDateFormat("dd/MM/yyyy").parse("28/03/2015"), true));
		automobileService.save(new Automobile("Toyota", "Yaris", "ZZ987UI",
				new SimpleDateFormat("dd/MM/yyyy").parse("12/10/2018"), true));
		automobileService.save(new Automobile("Peugeot", "208", "JJ789UI",
				new SimpleDateFormat("dd/MM/yyyy").parse("08/12/2017"), true));
		automobileService.save(new Automobile("Opel", "Corsa", "LK987HB",
				new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2018"), false));

		automobileService.save(new Automobile("Fiat", "Punto", "XZ987UI",
				new SimpleDateFormat("dd/MM/yyyy").parse("19/12/2016"), true));
		automobileService.save(new Automobile("Fiat", "500", "BN343MM",
				new SimpleDateFormat("dd/MM/yyyy").parse("01/04/2018"), true));
		automobileService.save(new Automobile("Audi", "A3", "KK547UI",
				new SimpleDateFormat("dd/MM/yyyy").parse("06/06/2019"), true));
		automobileService.save(new Automobile("Renault", "Clio", "BV878HJ",
				new SimpleDateFormat("dd/MM/yyyy").parse("02/04/2020"), false));

	}

}
