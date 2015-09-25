package com.core.design.dao;

import java.util.List;

/**
 * Created by klash75 on 9/23/2015.
 */
public class CustomerDaoImpl implements CustomerDao {

    private List<Customer> customers;

    public CustomerDaoImpl(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @Override
    public Customer getCustomerById(int id) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                return customers.get(i);
            }
        }
        return null;
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        if (customers.contains(customer)) {
            customers.set(customers.indexOf(customer), customer);
        }
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customers.remove(customer);
    }
}
