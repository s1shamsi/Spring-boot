package com.codeline.sbDemoBatch2.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Data
@Table(name = "Teacher_Table")
public class Teacher {

    @Id
    Integer id;

    @Column(name = "teacher_name",  nullable = false)
    String name;

    @Column
    String group_name;
}