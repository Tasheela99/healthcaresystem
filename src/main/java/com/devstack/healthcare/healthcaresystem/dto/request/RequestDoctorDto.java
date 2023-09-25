package com.devstack.healthcare.healthcaresystem.dto.request;


import lombok.*;

@Getter
@Setter
@Data
public class RequestDoctorDto {
    private String name;
    private String address;
    private String contact;
    private double salary;
}
