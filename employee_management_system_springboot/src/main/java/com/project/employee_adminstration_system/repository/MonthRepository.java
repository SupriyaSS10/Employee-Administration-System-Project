package com.project.employee_adminstration_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.employee_adminstration_system.model.Month;

@Repository
public interface MonthRepository extends JpaRepository<Month, Long> {

}
