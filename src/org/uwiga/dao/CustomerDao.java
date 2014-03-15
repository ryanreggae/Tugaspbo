package org.uwiga.dao;

import java.util.*;

import org.uwiga.model.Customer;

public interface CustomerDao {

	void saveOrUpdate(Customer o);

	void delete(Customer o);

	List<Customer> findAll();

	List<Customer> findById();
}
