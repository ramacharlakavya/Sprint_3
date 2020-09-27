package com.capgemini.inventorymanagementsystem.dto;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                        
@Table(name="ProductStock")    //* table name is productstock //
public class ProductStock {	
	 @Column(name="name")      //* column declaration //
	 String Name;
	 @Column(name="price_per_unit")
	 double pricePerUnit;
	 @Column(name="quantityvalue")
	 int quantityValue;
	 @Column(name="quantityunit")
	 int quantityUnit;
	 @Column(name="price")
	 double price;
	 @Column(name="warehouseid")
	 String warehouseId;
	 @Column(name="deliverydate")
	 Date deliveryDate;
	 @Column(name="manufacturingdate")
	 Date manufacturingDate;
	 @Column(name="expirydate")
	 Date expiryDate;
	 @Column(name="qualitycheck")
	 String qualityCheck;
	 @Column(name="processdate")
	 Date exitDate;
	 @Id                   // *primary key declaration
	 @Column(name="orderid")
	   int orderId;
	 public ProductStock() {}    
	 //*constructor//
	public ProductStock(String name, int quantityValue, double pricePerUnit, int quantityUnit,
			double price, String warehouseId, Date deliveryDate, Date manufacturingDate, Date expiryDate,
			String qualityCheck, Date exitDate,int orderId) {
		super();                   //*used to refer immediate parent class methods
		
		this.Name = name;
		this.quantityValue = quantityValue;
		this.pricePerUnit = pricePerUnit;
		this.quantityUnit = quantityUnit;
		this.price = price;
		this.warehouseId = warehouseId;
		this.deliveryDate = deliveryDate;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.qualityCheck = qualityCheck;
		this.exitDate = exitDate;
		this.orderId = orderId;
	}
	                        //* calling getters and setter methods//
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(int quantityValue) {
		this.quantityValue = quantityValue;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public int getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(int quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getQualityCheck() {
		return qualityCheck;
	}
	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}
	public Date getExitDate() {
		return exitDate;
	}
	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


}