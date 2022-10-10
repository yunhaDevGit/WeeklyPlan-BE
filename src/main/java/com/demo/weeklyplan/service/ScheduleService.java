package com.demo.weeklyplan.service;

import com.demo.weeklyplan.dto.ScheduleDto;

import java.util.List;

public interface ScheduleService {
    List<ScheduleDto> getScheduleList();
}
