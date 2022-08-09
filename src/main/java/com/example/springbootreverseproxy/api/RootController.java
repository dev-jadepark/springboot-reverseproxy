package com.example.springbootreverseproxy.api;

import com.example.springbootreverseproxy.common.ResultVo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public ResponseEntity<ResultVo> helloWorld(){

        ResultVo resultVo = ResultVo.builder().data("thejoin DEV WAS Hello World").build();

        return new ResponseEntity<>(resultVo, HttpStatus.OK);
    }


}
