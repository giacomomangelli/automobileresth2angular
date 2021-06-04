package it.prova.automobileresth2.service;

import java.util.List;

import org.springframework.data.domain.Page;

import it.prova.automobileresth2.model.Automobile;

public interface AutomobileService {

	List<Automobile> listAll();

	Page<Automobile> searchAndPaginate(Automobile automobileExample, Integer pageNo, Integer pageSize, String sortBy);

	Automobile get(Long idInput);

	Automobile save(Automobile input);

	void delete(Automobile input);

}
