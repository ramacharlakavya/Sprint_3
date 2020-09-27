package com.capgemini.inventorymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.inventorymanagementsystem.dao.ProductStockDAO;
import com.capgemini.inventorymanagementsystem.dto.ProductStock;


@Service           
public class ProductStockService {              //*class declaration//
	@Autowired     
    ProductStockDAO psdao;
	public void setpsdao(ProductStockDAO psdao) { this.psdao=psdao;}

	 @Transactional  
	    public String updateStock(ProductStock productStock)
	    {
		 ProductStock productStock2 = psdao.findById(productStock.getOrderId()).get();
		 if(productStock2!=null)                                      //*conditional statement//
		 {
			 productStock2.setManufacturingDate(productStock.getManufacturingDate());
			 productStock2.setExpiryDate(productStock.getExpiryDate());
			 productStock2.setQualityCheck(productStock.getQualityCheck());
			 return " Updated Stock Sucessfully";         //* if condition satisfied it will return
		 }
		 return "Updation Failed";
	    }

	 

}
	 


