package com.demo.weeklyplan.mapper;

import com.demo.weeklyplan.dto.ScheduleDto;
import com.demo.weeklyplan.entity.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ScheduleMapper extends GenericMapper<ScheduleDto, Schedule> {

    ScheduleMapper INSTANCE = Mappers.getMapper(ScheduleMapper.class);
}
