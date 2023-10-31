package com.example.pjcompo.util;

import com.example.pjcompo.dto.StudentDTO;
import com.example.pjcompo.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    StudentDTO getStudentDto(Student student);
    List<StudentDTO> getStudentDto(List<Student> students);
}
