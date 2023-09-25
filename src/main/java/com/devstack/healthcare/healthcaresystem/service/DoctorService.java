package com.devstack.healthcare.healthcaresystem.service;

import com.devstack.healthcare.healthcaresystem.dto.request.RequestDoctorDto;
import com.devstack.healthcare.healthcaresystem.dto.response.ResponseDoctorDto;

import java.util.List;

public interface DoctorService {

    public void createDoctor(RequestDoctorDto doctorDto);
    public ResponseDoctorDto getDoctor(long id);
    public void deleteDoctor(long id);
    public void updateDoctor(long id , RequestDoctorDto doctorDto);
    public List<ResponseDoctorDto> getAllDoctors(String searchText, int page, int size);

}
