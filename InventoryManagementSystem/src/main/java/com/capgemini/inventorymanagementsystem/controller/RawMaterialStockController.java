package com.capgemini.inventorymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inventorymanagementsystem.dto.RawMaterialStock;
import com.capgemini.inventorymanagementsystem.exception.NotFoundOperation;
import com.capgemini.inventorymanagementsystem.service.RawMaterialStockService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RawMaterialStockController {
 

		@Autowired           
		RawMaterialStockService rawMaterialStockService;
		public void setRawMaterialStockService(RawMaterialStockService rawMaterialStockService)
		{
			this.rawMaterialStockService=rawMaterialStockService;
		}
		
	   //* @putmapping is used to update properties //
		 @PutMapping(value="rawmaterial/updateStock",consumes="application/json")
		   public ResponseEntity<String> updateStock(@RequestBody()RawMaterialStock rawMaterialStock)
		   {
			   String message=rawMaterialStockService.updateStock(rawMaterialStock);
				  
				 
			   if(message!=null)     //*conditional statement//
					return	new ResponseEntity<String>(message, HttpStatus.OK);
				else
				    throw new NotFoundOperation("Item Not Found");
		   }
		  
		}


	