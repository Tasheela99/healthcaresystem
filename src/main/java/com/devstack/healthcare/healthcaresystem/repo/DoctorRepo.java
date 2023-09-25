package com.devstack.healthcare.healthcaresystem.repo;

import com.devstack.healthcare.healthcaresystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor,Long> {
}
