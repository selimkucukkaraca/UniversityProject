package service;

import dao.StudentDao;
import model.Student;

import java.util.List;

public class StudentService {

    private final StudentDao studentDao = new StudentDao();

    public void save(Student student) {

        if (student.getNumber().length() < 1) {
            System.out.println("Numara giriniz!");
        }
        studentDao.save(student);
    }

    public List<String> findAll() {
        return studentDao.findAll();
    }
}
