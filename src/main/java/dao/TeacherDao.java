package dao;

import model.Teacher;
import utils.FileName;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherDao {

    public void save(Teacher teacher) {

        try(Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileName.TEACHER_FILE, true), StandardCharsets.UTF_8))) {

            writer.write(teacher + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> findAll() {
        final List<String> teacherList = new ArrayList<>();

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(FileName.TEACHER_FILE)))) {

            while (scanner.hasNextLine()) {
                teacherList.add(scanner.nextLine());
            }
            return teacherList;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
