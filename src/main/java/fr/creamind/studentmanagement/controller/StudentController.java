package fr.creamind.studentmanagement.controller;

import fr.creamind.studentmanagement.entity.Student;
import fr.creamind.studentmanagement.service.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // handler method to handler list students and return mode and view

    @GetMapping("/students")
    public String listStudents(Model model,
                               @RequestParam(name = "page",defaultValue = "0") int page,
                               @RequestParam(name = "size" , defaultValue = "10") int size){
        Page<Student> pageStudents = studentService.getAllStudents(page,size);
        model.addAttribute("students",pageStudents.getContent());
        model.addAttribute("pages",new int[pageStudents.getTotalPages()]);
        model.addAttribute("currentPage",page);
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        // craete student object to hold student data
        Student student = new Student();
        model.addAttribute("student",student);

        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
       model.addAttribute("student",studentService.getStudentById(id));
       return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
                                Model model){
        // get student from database by id

        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        // save updated student object

        studentService.updateStudent(existingStudent);

        return "redirect:/students";
    }

    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return  "redirect:/students";
    }

}
