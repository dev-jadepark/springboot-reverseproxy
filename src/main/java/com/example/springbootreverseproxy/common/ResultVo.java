package com.example.springbootreverseproxy.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(value= JsonInclude.Include.NON_NULL)
public class ResultVo {
    private String data;
}
