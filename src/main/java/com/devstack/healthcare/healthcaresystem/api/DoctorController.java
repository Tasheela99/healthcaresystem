package com.devstack.healthcare.healthcaresystem.api;


import com.devstack.healthcare.healthcaresystem.dto.request.RequestDoctorDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/doctors")
public class DoctorController {

    @PostMapping
    public String createDoctor(@RequestBody RequestDoctorDto doctorDto) {
        return doctorDto.toString();
    }


    @GetMapping
    public String findDoctor() {
        return "findDoctor";
    }

    @PutMapping
    public String updateDoctor() {
        return "updateDoctor";
    }


    @DeleteMapping
    public String deleteDoctor() {
        return "DeleteDoctor";
    }

    @GetMapping("/list")
    public String findAllDoctors() {
        return "findAllDoctors";
    }


}
