package com.devofficer.dovendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devofficer.dovendas.dto.SaleSuccessDTO;
import com.devofficer.dovendas.dto.SaleSumDTO;
import com.devofficer.dovendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.devofficer.dovendas.dto.SaleSumDTO(obj.seller, SUM (obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.devofficer.dovendas.dto.SaleSuccessDTO(obj.seller, SUM (obj.visited), SUM (obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
