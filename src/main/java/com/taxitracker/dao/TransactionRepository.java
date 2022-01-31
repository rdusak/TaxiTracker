package com.taxitracker.dao;

import org.springframework.data.repository.CrudRepository;

import com.taxitracker.dto.TransactionDTO;

public interface TransactionRepository extends CrudRepository<TransactionDTO, Integer> {

}
