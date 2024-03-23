package com.devharika.demo.payloads;

import  lombok.AllArgsConstructor;
import lombok.Getter;
import  lombok.Setter;
import lombok.NoArgsConstructor;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
    private String message;
    private boolean succcess;

}
