package com.example.Project01.Model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ClothStore")
public class ClothStore {
	@Id
	private int Counters;
	private String Sections;
	private String Collections;
	private int Price;
	private int OfferPrice;
	private int CouponCards;
	private String gifts;
	public int getCounters() {
		return Counters;
	}
	public void setCounters(int counters) {
		Counters = counters;
	}
	public String getSections() {
		return Sections;
	}
	public void setSections(String sections) {
		Sections = sections;
	}
	public String getCollections() {
		return Collections;
	}
	public void setCollections(String collections) {
		Collections = collections;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getOfferPrice() {
		return OfferPrice;
	}
	public void setOfferPrice(int offerPrice) {
		OfferPrice = offerPrice;
	}
	public int getCouponCards() {
		return CouponCards;
	}
	public void setCouponCards(int couponCards) {
		CouponCards = couponCards;
	}
	public String getGifts() {
		return gifts;
	}
	public void setGifts(String gifts) {
		this.gifts = gifts;
	}
	@Override
	public String toString() {
		return "ClothStore [Counters=" + Counters + ", Sections=" + Sections + ", Collections=" + Collections
				+ ", Price=" + Price + ", OfferPrice=" + OfferPrice + ", CouponCards=" + CouponCards + ", gifts="
				+ gifts + "]";
	}
	
	
	
}
