package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<mydata> findByProdCode(String prodCode);
	List<myName>findByProdId(Integer prodId);
	List<myView>findByProdModelOrProdCost(String prodModel,Double prodCost);
	
	interface mydata{
		String getProdCode();
	    String getProdModel();
		
	}
	interface myName{
		String getProdId();
	    String getProdVendor();
		
	}
	interface myView{
		String getProdModel();
		Double getProdCost();
		
	}
	
	
	
	
	
}
