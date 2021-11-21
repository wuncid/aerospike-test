package com.wuncid.aerospiketest.repository;

import com.wuncid.aerospiketest.model.User;
import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface UserRepository extends AerospikeRepository<User, Integer> {
}
