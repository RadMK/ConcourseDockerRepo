package com.infy.springboot.rest.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springboot.rest.model.NavFinding;;

@Repository
public interface NavRepo extends JpaRepository<NavFinding, Long>{
   
} 