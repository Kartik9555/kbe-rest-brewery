package com.example.practice.kberestbrewery.web.mappers;

import com.example.practice.kberestbrewery.domain.Customer;
import com.example.practice.kberestbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
