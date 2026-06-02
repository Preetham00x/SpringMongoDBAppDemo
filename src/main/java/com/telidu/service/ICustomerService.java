package com.telidu.service;

import java.util.List;

import com.telidu.Dto.CustomerDto;
import com.telidu.model.Customer;
import com.telidu.repo.ICustomerRepo;

public interface ICustomerService {
	public String registercustomer(CustomerDto dto);
	public List<Customer> findAllCustomer();

}
