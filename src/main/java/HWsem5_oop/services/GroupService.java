package HWsem5_oop.services;

import HWsem5_oop.models.Student;
import HWsem5_oop.models.Teacher;
import HWsem5_oop.models.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GroupService {

    public GroupService(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    private final StudentService studentService;
    private final TeacherService teacherService;


    public List<User> getAllUsersFromGroup(String groupTitle) {

        List<User> users = new ArrayList<>(teacherService.getAllByTitile(groupTitle));
        users.addAll(studentService.getAllByTitile(groupTitle));
        return users;
    }
}


