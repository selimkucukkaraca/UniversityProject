package service;

import dao.TeacherDao;
import model.Teacher;

import java.util.List;

public class TeacherService {

    private final TeacherDao teacherDao = new TeacherDao();

    public void save(Teacher teacher) {
        teacherDao.save(teacher);
    }

    public List<String> findAll() {
        return teacherDao.findAll();
    }
}
