package com.demo.weeklyplan.service.impl;

import com.demo.weeklyplan.dao.ScheduleRepository;
import com.demo.weeklyplan.dto.ScheduleDto;
import com.demo.weeklyplan.entity.Schedule;
import com.demo.weeklyplan.mapper.ScheduleMapper;
import com.demo.weeklyplan.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;
    @Override
    public List<ScheduleDto> getScheduleList() {
        List<Schedule> scheduleList = scheduleRepository.findAll();
        return ScheduleMapper.INSTANCE.toDtoList(scheduleList);
    }
}
