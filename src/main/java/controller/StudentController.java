package controller;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;
import serviceImpl.StudentServiceImpl;

@RestController
public class StudentController {

    @Autowired
    StudentServiceImpl ssi;

    @RequestMapping("/select")
    public Student selectById(@RequestParam Integer id){

        return ssi.selectById(id);
    }

    @RequestMapping("/insert")
    public int insert(){
        Student stu = new Student("张三",21);
        return ssi.insert(stu);
    }

    @RequestMapping("/delete22")
    public int delete(@RequestParam Integer id){

        return ssi.delete(id);
    }

    @RequestMapping("/modify")
    public int modify(){
        Student stu = new Student(1016,"赵六",25);
        return ssi.modify(stu);
    }

    @RequestMapping("/selectByNA")
    public Student selectByNA(){

        return ssi.selectByNameAndAge("my",18);
    }
}