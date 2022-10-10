package com.demo.weeklyplan.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity(name = "schedule_entity")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private String id;

    @OneToMany(mappedBy = "schedule")
    private List<ScheduleDate> scheduleDateList;

    @Column
    private String detail;

    @Column
    private Timestamp createdAt;

    @Column
    private Timestamp updatedAt;

}
