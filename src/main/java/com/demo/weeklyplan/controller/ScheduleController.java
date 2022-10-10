package com.demo.weeklyplan.controller;

import com.demo.weeklyplan.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value = "/schedule")
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping("/list")
    public ResponseEntity<?> getScheduleList() {
        return ResponseEntity.ok(scheduleService.getScheduleList());
    }


}
