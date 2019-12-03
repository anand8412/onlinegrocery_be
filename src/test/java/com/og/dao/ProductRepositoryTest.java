package com.og.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.og.Application;
import com.og.Product;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ProductRepositoryTest {

	@Autowired
	private ProductRepository prodRepository;

	@Test
	public void createProducts() {

		Product product1 = new Product();
		product1.setBrand("lactaid");
		product1.setDescription("lact aid milk very good");
		product1.setImageURL("https://target.scene7.com/is/image/Target/GUEST_419f1169-a698-45a1-8d89-ad28136ba841?wid=250&hei=250&fmt=webp");
		product1.setInStock(true);
		product1.setMaxQuantity(20);
		product1.setName("Lactaid Milk");
		product1.setPrice(12);
		
		Product product2 = new Product();
		product2.setBrand("nadhini");
		product2.setDescription("nandhini karnataka id milk very good");
		product2.setImageURL("https://www.kmfnandini.coop/sites/default/files/styles/product_popup_600x500/public/products/Pasteurised-Toned-Milk-b.png?itok=x64Sfsmk");
		product2.setInStock(true);
		product2.setMaxQuantity(10);
		product2.setName("nandhini Milk");
		product2.setPrice(18);
		
	
		Product product3 = new Product();
		product3.setBrand("tommy hillfiger");
		product3.setDescription("best suit for marriages");
		product3.setImageURL("https://slimages.macysassets.com/is/image/MCY/products/1/optimized/9346141_fpx.tif?op_sharpen=1&wid=1230&hei=1500&fit=fit,1&$filterxlrg$");
		product3.setInStock(true);
		product3.setMaxQuantity(5);
		product3.setName("tomm hillger suit");
		product3.setPrice(5000);
		
		Product product4 = new Product();
		product4.setBrand("mac");
		product4.setDescription("mac airbook laptop config 16 gb");
		product4.setImageURL("https://images-na.ssl-images-amazon.com/images/I/718yrTSpFYL._SX679_.jpg");
		product4.setInStock(true);
		product4.setMaxQuantity(32);
		product4.setName("mac airbook");
		product4.setPrice(149000);
		
		Product product5 = new Product();
		product5.setBrand("samsung");
		product5.setDescription("samsung mobile configuration");
		product5.setImageURL("https://image.samsung.com/us/smartphones/galaxy-note9/v1/images/galaxy-note9_overview_kv_type1_l.png");
		product5.setInStock(true);
		product5.setMaxQuantity(32);
		product5.setName("samsung mobile");
		product5.setPrice(30000);
		
		Product product6 = new Product();
		product6.setBrand("nokia");
		product6.setDescription("nokia mobile configuration");
		product6.setImageURL("https://images.ctfassets.net/wcfotm6rrl7u/6nhrbY5ZOud67QpK9vy754/1b66a9d2b4e5943a5984121afc97d04f/nokia_3_1_A-recommended-black.png?w=2560");
		product6.setInStock(false);
		product6.setMaxQuantity(32);
		product6.setName("nokia mobile");
		product6.setPrice(25000);
	
		prodRepository.save(product1);
		prodRepository.save(product2);
		prodRepository.save(product3);
		prodRepository.save(product4);
		prodRepository.save(product5);
		prodRepository.save(product6);
		

	}

}
