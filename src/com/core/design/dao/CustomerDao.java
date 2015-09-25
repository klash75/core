package com.core.design.dao;

import java.util.List;

/**
 * Created by klash75 on 9/23/2015.
 */
public interface CustomerDao {

    List<Customer> getAllCustomers();

    Customer getCustomerById(int id);

    void addCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);
}
