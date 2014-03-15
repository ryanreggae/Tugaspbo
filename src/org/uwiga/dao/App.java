package org.uwiga.dao;

import java.util.ArrayList;
import java.util.List;

import org.uwiga.model.Customer;

public class App {
	public App(){
		//membuat objek
		CustomerDao customerManager = new CustomerDaoImpl();
		//memasukkan data
		Customer cust1 = new Customer();
		cust1.setIdCustomer("001");
		cust1.setName("bari prima");
		customerManager.saveOrUpdate(cust1);
		
		Customer cust2 = new Customer();
		cust2.setIdCustomer("002");
		cust2.setName("ibu bari prima");
		customerManager.saveOrUpdate(cust2);
		
		//menampilkan data di frame
		List<Customer> x = new ArrayList<>();
		x = customerManager.findAll();
		for (Customer Item : x){
			System.out.println(Item);
		}
		for (int i=0; i<x.size(); i++){
			Customer Item = new Customer();
			Item = x.get(i);
			System.out.println(Item);
		}
	}
	public static void main(String[] args) {
		App f = new App();
	}

}
