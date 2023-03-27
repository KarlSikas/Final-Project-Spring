package com.example.finalprojectspr.services;

import com.example.finalprojectspr.exceptions.CustomerNotFoundException;
import com.example.finalprojectspr.models.Customer;

import java.util.List;

/**
 * @author Karl-Erik Sirkas
 * @ Date 22.03.2023
 */
public interface CustomerService {
    void addCustomer (Customer customer);

    Customer findCustomerByName(String Name) throws CustomerNotFoundException;

    void updateCustomer(Customer customer) throws CustomerNotFoundException;

    List<Customer> findAllCustomers();
}