package com.example.springbootreverseproxy.api;

import com.example.springbootreverseproxy.common.ResultVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

@RestController
@RequiredArgsConstructor
@Slf4j
public class RootController {

    private final Environment env;




    @GetMapping("/")
    public ResponseEntity<ResultVo> helloWorld(){
        LocalTime localTime = LocalTime.now();

        int HH = localTime.getHour();
        int mm = localTime.getMinute();
        int ss = localTime.getSecond();
        System.out.println( HH + ":" + mm + ":" + ss + " request");
        ResultVo resultVo = ResultVo.builder().data(HH + ":" + mm + ":" + ss + ":" + Arrays.toString(env.getActiveProfiles()) + " WAS Hello World").build();

        return new ResponseEntity<>(resultVo, HttpStatus.OK);

    }

    @GetMapping("/test")
    public ResponseEntity<ResultVo> helloWorldtest(){
        LocalTime localTime = LocalTime.now();

        int HH = localTime.getHour();
        int mm = localTime.getMinute();
        int ss = localTime.getSecond();
        System.out.println( HH + ":" + mm + ":" + ss + " request");
        ResultVo resultVo = ResultVo.builder().data(HH + ":" + mm + ":" + ss + ":" + Arrays.toString(env.getActiveProfiles()) + " WAS Hello World").build();
        return new ResponseEntity<>(resultVo, HttpStatus.OK);
    }


}
