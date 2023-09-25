package com.devstack.healthcare.healthcaresystem.api;


import com.devstack.healthcare.healthcaresystem.dto.request.RequestDoctorDto;
import com.devstack.healthcare.healthcaresystem.service.DoctorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/doctors")
public class DoctorController {


    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public String createDoctor(@RequestBody RequestDoctorDto doctorDto) {
        doctorService.createDoctor(doctorDto);
        return doctorDto.getName();
    }

    @GetMapping("/{id}")
    public String findDoctor(@PathVariable String id) {
        return id+"";
    }

    @PutMapping(params = "id")
    public String updateDoctor(
            @RequestParam String id,
            @RequestBody RequestDoctorDto doctorDto
    ) {
        return doctorDto.toString();
    }


    @DeleteMapping("/{id}")
    public String deleteDoctor(@PathVariable String id) {
        return "DeleteDoctor";
    }

    @GetMapping(value = "/list", params = {"searchText","page","size"})
    public String findAllDoctors(
            @RequestParam String searchText,
            @RequestParam int page,
            @RequestParam int size

    ) {
        return "findAllDoctors";
    }


}
