package com.school.persistence.controller;

import com.school.persistence.entity.Teacher;
import com.school.persistence.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/teacher")
public class TeacherController {
    @Autowired
    private TeacherRepository teacherRepo;

    @GetMapping(path = "/")
    @ResponseBody Iterable<Teacher> getAllTeacher(){
        return teacherRepo.findAll();
    }

    @PostMapping(path = "/add")
    @ResponseBody Teacher createTeacher(@RequestBody Teacher teacher){
        return teacherRepo.saveAndFlush(teacher);
    }
}
