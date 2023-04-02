package com.demo.grade.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorVM implements Serializable {

    private static final long serialVersionUID = 1L;

    private ErrorCode errorCode;

    private String message;
    
    private String description;
    
    private List<FieldErrorVM> fieldErrors;
    
}