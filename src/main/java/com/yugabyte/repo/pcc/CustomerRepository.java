package com.yugabyte.repo.pcc;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.yugabyte.domain.Customer;

public interface CustomerRepository extends CassandraRepository<Customer, String> {
	
}
