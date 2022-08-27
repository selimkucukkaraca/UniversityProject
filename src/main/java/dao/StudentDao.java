package dao;

import model.Student;
import utils.FileName;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {

    public void save(Student student) {

        try(Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileName.STUDENT_FILE, true), StandardCharsets.UTF_8))) {

            writer.write(student + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> findAll() {
        final List<String> studentList = new ArrayList<>();

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(FileName.STUDENT_FILE)))) {

            while (scanner.hasNextLine()) {
                studentList.add(scanner.nextLine());
            }
            return studentList;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
