package com.simple.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.dao.CustomerRepository;
import com.simple.model.Customer;

@Service
@Transactional
public class CustomerService {
    @Autowired
    CustomerRepository repo;
     
    public void save(Customer customer) {
        repo.save(customer);
    }
     
    public List<Customer> listAll() {
        return (List<Customer>) repo.findAll();
    }
     
    public Customer get(Long id) {
        return repo.findById(id).get();
    }
     
    public void delete(Long id) {
        repo.deleteById(id);
    }
    public List<Customer> search(String keyword) {
        return repo.search(keyword);
    }
}