package com.graymatter.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="prjord")
public class Order {
	@Id
	private int orderId;
	private Date orderDate;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(joinColumns= @JoinColumn(name="itemId"),inverseJoinColumns=@JoinColumn(name="orderId"))
			
	
	private List<Item> itemList;
	

}
