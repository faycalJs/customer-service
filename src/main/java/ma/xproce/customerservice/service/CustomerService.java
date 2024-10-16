package ma.xproce.customerservice.service;

import ma.xproce.customerservice.dao.entities.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getAllCustomers();
    public Customer customerById(Long id);
    public Customer saveCustomer(Customer customer);


}
