package com.codeline.sbDemoBatch2.Repositories;

import com.codeline.sbDemoBatch2.Models.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRep extends JpaRepository<School, Integer> {

    @Query(value = "SELECT s from School s")
    List<School> getAllSchools();

    @Query(value = "SELECT s from School s where s.id = :schoolId")
    School getSchoolById(@Param("schoolId") Integer id);

    @Query(value = "SELECT s from School s " +
            "WHERE s.name = :schoolName")
    School getBySchoolName(@Param("schoolName") String schoolName);

    @Query(value = "SELECT s from School s where s.isActive = true")
    List<School> getAllActiveSchools();

}

