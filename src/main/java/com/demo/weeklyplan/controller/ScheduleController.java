package com.demo.weeklyplan.controller;

import com.demo.weeklyplan.dto.ScheduleDto;
import com.demo.weeklyplan.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/schedule")
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping(value = "/list")
    public List<ScheduleDto> getScheduleList() {
        return scheduleService.getScheduleList();
    }


}
