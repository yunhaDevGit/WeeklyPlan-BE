package com.demo.weeklyplan.service.impl;

import com.demo.weeklyplan.dao.ScheduleRepository;
import com.demo.weeklyplan.entity.Schedule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScheduleServiceImplTest {

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Test
    void getScheduleList() {
    }

    @Test
    void createScheulde() {
        Schedule schedule = Schedule.builder().title("test1").detail("testcode").build();
        scheduleRepository.save(schedule);
    }
}