package com.ybq.mvc.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserRequestParam implements Serializable {
    private String username;
    private int age;
    private List<AddressDto> addresses;
}
