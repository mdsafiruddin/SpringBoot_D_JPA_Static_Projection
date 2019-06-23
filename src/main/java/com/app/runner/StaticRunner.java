package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class StaticRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;
	
	

	@Override
	public void run(String... args) throws Exception {
		Product p=new Product();
		p.setProdId(44);
		p.setProdCode("aaa");
		p.setProdModel("AV6D");
        p.setProdVendor("rama");
        p.setProdCost(8.9);
        repo.save(p);
        
      /*  Product p2=new Product();
		p2.setProdId(45);
		p2.setProdCode("Aca");
		p2.setProdModel("AVD6");
        p2.setProdVendor("rani");
        p2.setProdCost(8.0);
        repo.save(p2);
        
        Product p3=new Product();
		p3.setProdId(48);
		p3.setProdCode("ABC");
		p3.setProdModel("ACV6");
        p3.setProdVendor("rana");
        p3.setProdCost(7.9);
          repo.save(p3); 
       */
        
       /*repo.findByProdCode("ABC")
       .forEach(P-> System.out.println(p.getProdCode()+", "+p.getProdModel()));
        */
        
       
      /* repo.findByProdId(48)
       .forEach(P-> System.out.println(p.getProdId()+", "+p.getProdVendor()));
        */
       
       repo.findByProdModelOrProdCost("AV6D",8.9).forEach(P-> System.out.println(p.getProdModel()+", "+p.getProdCost()));
    	
        
	}

}
