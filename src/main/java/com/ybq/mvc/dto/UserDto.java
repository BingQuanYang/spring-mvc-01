package com.ybq.mvc.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserDto implements Serializable {
    private int id;
    private String username;
    private AddressDto addressDto;
    private List<String> list;
}
