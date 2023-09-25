package com.devstack.healthcare.healthcaresystem.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResponseDoctorDto {

    private long id;
    private String name;
    private String address;
    private String contact;
    private double salary;
}
