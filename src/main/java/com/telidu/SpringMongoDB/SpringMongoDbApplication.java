package com.telidu.SpringMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telidu.Dto.CustomerDto;
import com.telidu.model.Customer;
import com.telidu.service.CustomerService;

@SpringBootApplication
public class SpringMongoDbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container= SpringApplication.run(SpringMongoDbApplication.class, args);
		CustomerService service=container.getBean(CustomerService.class);
		CustomerDto dto=new CustomerDto( null, 4,"niggesh","hyd");
		String status=service.registercustomer(dto);
		System.out.println(status);
		service.findAllCustomer().forEach(c->System.out.println(c));
		
	}

}
