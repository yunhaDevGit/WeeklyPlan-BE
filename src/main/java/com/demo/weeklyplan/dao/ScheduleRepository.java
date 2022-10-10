package com.demo.weeklyplan.dao;

import com.demo.weeklyplan.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, String> {
}
