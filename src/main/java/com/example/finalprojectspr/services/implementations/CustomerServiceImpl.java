package com.example.finalprojectspr.services.implementations;

import com.example.finalprojectspr.exceptions.CustomerNotFoundException;
import com.example.finalprojectspr.models.Customer;
import com.example.finalprojectspr.repositories.CustomerRepository;
import com.example.finalprojectspr.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author karl-erik sirkas
 * @ Date 23.03.2023
 */
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public Customer findCustomerByName(String Name) throws CustomerNotFoundException {
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) throws CustomerNotFoundException {

    }

    @Override
    public List<Customer> findAllCustomers() {
        return null;
    }
}
}