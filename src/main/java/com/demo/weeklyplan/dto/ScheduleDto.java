package com.demo.weeklyplan.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class ScheduleDto {

    private String id;
    private List<ScheduleDateDto> scheduleDateDtoList;
    private String detail;
    private Timestamp createdAt;
    private Timestamp updatedAt;

}
