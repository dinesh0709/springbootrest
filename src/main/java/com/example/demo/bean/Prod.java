package com.example.demo.bean;

public class Prod {
	
	private int prodId;
	private String prodName;
	private String prodDesc;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	/**
	 * @param prodId
	 * @param prodName
	 * @param prodDesc
	 */
	public Prod(int prodId, String prodName, String prodDesc) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
	}
	/**
	 * 
	 */
	public Prod() {
		super();
	}
	@Override
	public String toString() {
		return "Prod [prodId=" + prodId + ", prodName=" + prodName + ", prodDesc=" + prodDesc + "]";
	}



}