package com.hrm.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hrm.employee.entity.Leaves;

@Repository
public interface LeavesRepository extends JpaRepository<Leaves, Integer> {

}
