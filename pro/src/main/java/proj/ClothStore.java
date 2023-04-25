package proj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ClothStore")
public class ClothStore {
	@Id
	@Column(name="counters")
	
private int counters;
private String sections;
private String collections;
private int price;
private int offerprice;
private int couponcards;
private String gifts;
public int getCounters() {
	return counters;
}
public void setCounters(int counters) {
	this.counters = counters;
}
public String getSections() {
	return sections;
}
public void setSections(String sections) {
	this.sections = sections;
}
public String getCollections() {
	return collections;
}
public void setCollections(String collections) {
	this.collections = collections;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getOfferprice() {
	return offerprice;
}
public void setOfferprice(int offerprice) {
	this.offerprice = offerprice;
}
public int getCouponcards() {
	return couponcards;
}
public void setCouponcards(int couponcards) {
	this.couponcards = couponcards;
}
public String getGifts() {
	return gifts;
}
public void setGifts(String gifts) {
	this.gifts = gifts;
}



}







