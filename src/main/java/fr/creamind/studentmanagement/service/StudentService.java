package fr.creamind.studentmanagement.service;

import fr.creamind.studentmanagement.entity.Student;
import org.springframework.data.domain.Page;



public interface StudentService {
 Page<Student> getAllStudents(int page, int size);
 Student saveStudent(Student student);
 Student getStudentById(Long id);
 Student updateStudent(Student student);
 void deleteStudentById(Long id);


}
