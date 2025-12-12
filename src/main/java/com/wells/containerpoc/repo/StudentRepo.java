package com.wells.containerpoc.repo;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends org.springframework.data.jpa.repository.JpaRepository<com.wells.containerpoc.entity.Student, Integer> {

}
