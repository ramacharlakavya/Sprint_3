package com.capgemini.inventorymanagementsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.dto.ProductStock;
import com.capgemini.inventorymanagementsystem.exception.NotFoundOperation;
import com.capgemini.inventorymanagementsystem.service.ProductStockService;




@CrossOrigin(origins = "http://localhost:4200")
@RestController        
public class ProductStockController
{
	@Autowired  
	ProductStockService productStockService;
	public void setProductStockService(ProductStockService productStockService)
	{
		this.productStockService=productStockService;    //*used to refer current variable//
	}
	
	//* used to update stock details//
   @PutMapping(value="productstock/updateStock",consumes="application/json")
   public ResponseEntity<String> updateStock(@RequestBody()ProductStock productStock)
   {
	   String ps=productStockService.updateStock(productStock);
		  if(ps!=null)                              //*conditional statement
				return	new ResponseEntity<String>(ps, HttpStatus.OK);
			else
			    throw new NotFoundOperation("Item Not Found");
   }
  
}
  



