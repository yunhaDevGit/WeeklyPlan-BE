package com.demo.weeklyplan.dto;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class ScheduleDateDto {

    private String id;
    private ScheduleDto scheduleDto;
    private Timestamp date;
    private Timestamp createdAt;
    private Timestamp updatedAt;

}
