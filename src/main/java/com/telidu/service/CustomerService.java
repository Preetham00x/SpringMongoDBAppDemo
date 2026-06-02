package com.telidu.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telidu.Dto.CustomerDto;
import com.telidu.model.Customer;
import com.telidu.repo.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService {
	@Autowired
	private ICustomerRepo repo;

	@Override
	public String registercustomer(CustomerDto dto) {
		// TODO Auto-generated method stub
		Customer cx=new Customer();
		BeanUtils.copyProperties(dto, cx);
		Customer cxd= repo.save(cx);
		return "customer data saved in mongodb and id is"+ cxd.getId();
				}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
