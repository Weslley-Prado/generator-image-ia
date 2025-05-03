package domain.repositories;

import domain.models.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> find(CustomerQuery query);

    default List<Customer> findAll(){
        return find(new CustomerQuery.Builder().build());
    }
}
