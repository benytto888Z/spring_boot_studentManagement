package fr.creamind.studentmanagement.repository;

import fr.creamind.studentmanagement.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

    Page<Student> findByFirstNameContains(String kw, Pageable pageable);

}
