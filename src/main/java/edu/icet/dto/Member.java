package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Member {
    private Integer memberID;
    private  String name;
    private  String email;
    private  String phone;
    private  String nic;
    private  String address;
}
