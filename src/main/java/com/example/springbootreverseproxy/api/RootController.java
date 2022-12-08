package com.example.springbootreverseproxy.api;

import com.example.springbootreverseproxy.common.ResultVo;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;

@RestController
@RequiredArgsConstructor
public class RootController {

    private final Environment env;
    String[] activeProfiles = env.getActiveProfiles();

    final Date date = new Date();

    @GetMapping("/")
    public ResponseEntity<ResultVo> helloWorld(){
        System.out.println( date.getTime() +" request");
        ResultVo resultVo = ResultVo.builder().data(Arrays.toString(activeProfiles) + " WAS Hello World").build();

        return new ResponseEntity<>(resultVo, HttpStatus.OK);

    }

    @GetMapping("/test")
    public ResponseEntity<ResultVo> helloWorldtest(){
        System.out.println( date.getTime() +" request");
        ResultVo resultVo = ResultVo.builder().data(Arrays.toString(activeProfiles) + " WAS Hello World").build();
        return new ResponseEntity<>(resultVo, HttpStatus.OK);
    }


}
