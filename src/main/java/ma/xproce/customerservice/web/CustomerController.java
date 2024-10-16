package ma.xproce.customerservice.web;

import ma.xproce.customerservice.dao.entities.Customer;
import ma.xproce.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/customers")
    public List<Customer> customerList(){
        return customerService.getAllCustomers();

    }
    @GetMapping ("/customers/{id}")
    public Customer customerById(@PathVariable Long id){

        return customerService.customerById(id);

    }
    @PostMapping()
    public Customer saveCustomer(Customer customer){
        Customer customer1=customerService.saveCustomer(customer);
        return customer1;
    }


}
