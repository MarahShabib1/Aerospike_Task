package com.example.soap221.repository;

import com.example.soap221.model.User;
import org.springframework.data.aerospike.repository.AerospikeRepository;
import org.springframework.stereotype.Component;



public interface UserRepository extends AerospikeRepository<User, Integer> {
}