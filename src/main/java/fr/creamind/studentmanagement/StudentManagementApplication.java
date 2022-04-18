package fr.creamind.studentmanagement;

import fr.creamind.studentmanagement.entity.Student;
import fr.creamind.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }
    @Autowired
    private  StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
       /* studentRepository.save(new Student(null,"Nelly","Adebo","nelly@gmail.com"));
        studentRepository.save(new Student(null,"Prisca","Laurence","laurence@gmail.com"));
        studentRepository.save(new Student(null,"Louis","Michel","louis@gmail.com"));
        studentRepository.save(new Student(null,"Mike","Tyson","mike@gmail.com"));
        studentRepository.save(new Student(null,"Nelly","Adebo","nelly@gmail.com"));
        studentRepository.save(new Student(null,"Prisca","Laurence","laurence@gmail.com"));
        studentRepository.save(new Student(null,"Louis","Michel","louis@gmail.com"));
        studentRepository.save(new Student(null,"Mike","Tyson","mike@gmail.com"));
        studentRepository.save(new Student(null,"Nelly","Adebo","nelly@gmail.com"));
        studentRepository.save(new Student(null,"Prisca","Laurence","laurence@gmail.com"));
        studentRepository.save(new Student(null,"Louis","Michel","louis@gmail.com"));
        studentRepository.save(new Student(null,"Mike","Tyson","mike@gmail.com"));
        studentRepository.save(new Student(null,"Nelly","Adebo","nelly@gmail.com"));
        studentRepository.save(new Student(null,"Prisca","Laurence","laurence@gmail.com"));
        studentRepository.save(new Student(null,"Louis","Michel","louis@gmail.com"));
        studentRepository.save(new Student(null,"Mike","Tyson","mike@gmail.com"));*/
    }
}
