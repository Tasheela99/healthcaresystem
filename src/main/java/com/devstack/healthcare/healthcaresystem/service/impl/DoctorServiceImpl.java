package com.devstack.healthcare.healthcaresystem.service.impl;

import com.devstack.healthcare.healthcaresystem.dto.request.RequestDoctorDto;
import com.devstack.healthcare.healthcaresystem.dto.response.ResponseDoctorDto;
import com.devstack.healthcare.healthcaresystem.entity.Doctor;
import com.devstack.healthcare.healthcaresystem.repo.DoctorRepo;
import com.devstack.healthcare.healthcaresystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class DoctorServiceImpl implements DoctorService {


    private final DoctorRepo doctorRepo;

    @Autowired
    public DoctorServiceImpl(DoctorRepo doctorRepo) {
        this.doctorRepo = doctorRepo;
    }


    @Override
    public void createDoctor(RequestDoctorDto doctorDto) {

        UUID uuid = UUID.randomUUID();
        long docId = uuid.getMostSignificantBits();

        Doctor doctor = new Doctor(
                docId,
                doctorDto.getName(),
                doctorDto.getAddress(),
                doctorDto.getContact(),
                doctorDto.getSalary()
        );

        doctorRepo.save(doctor);
    }

    @Override
    public ResponseDoctorDto getDoctor(long id) {
        return null;
    }

    @Override
    public void deleteDoctor(long id) {

    }

    @Override
    public void updateDoctor(long id, RequestDoctorDto doctorDto) {

    }

    @Override
    public List<ResponseDoctorDto> getAllDoctors(String searchText, int page, int size) {
        return null;
    }
}
