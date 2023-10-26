package com.teachers.teachers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService; // Corrected variable name

    @RequestMapping("/teacher")
    public List<Teacher> getTeachers() {
        return teacherService.getTeacher(); // Corrected method call
    }

    @RequestMapping(method = RequestMethod.POST, value = "/teacher")
    public void addTeacher(@RequestBody Teacher teacher) { // Corrected method name
        teacherService.addTeacher(teacher); // Corrected method call
    }

    @RequestMapping("/teacher/{id}")
    public Optional<Teacher> getTeacher(@PathVariable String id) {
        System.out.println("Inside getTeacher");
        return teacherService.getTeacher(id); // Corrected method call
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/teacher/{id}")
    public void updateTeacher(@RequestBody Teacher teacher, @PathVariable String id) { // Corrected method name
        System.out.println("Inside updateTeacher");
        teacherService.updateTeacher(id, teacher); // Corrected method call
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/teacher/{id}")
    public void deleteTeacher(@PathVariable String id) {
        System.out.println("Inside deleteTeacher");
        teacherService.deleteTeacher(id); // Corrected method call
    }
}
