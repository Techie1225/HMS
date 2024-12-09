package com.spring.hms.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.hms.entity.Payment;


@Repository
public interface IPaymentRepo extends CrudRepository<Payment, Integer> {

}
