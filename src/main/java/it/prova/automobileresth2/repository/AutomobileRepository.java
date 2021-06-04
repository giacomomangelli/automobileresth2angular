package it.prova.automobileresth2.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import it.prova.automobileresth2.model.Automobile;

public interface AutomobileRepository extends PagingAndSortingRepository<Automobile, Long>, JpaSpecificationExecutor<Automobile>{

}
