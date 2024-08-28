package com.graymatter.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="prjItem")
public class Item {
	@Id
	private int id;
	private String itemName;
	@ManyToMany(mappedBy="itemList")
	private List<Order> orderList;
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", orderList=" + orderList + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	public Item(int id, String itemName, List<Order> orderList) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.orderList = orderList;
	}
	public Item() {
		super();
	}

}
