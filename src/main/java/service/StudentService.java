package service;

import entity.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentService {
    Student selectById(Integer id);
    int insert(Student student);
    int delete(Integer id);
    int modify(Student student);

    Student selectByNameAndAge(String name,Integer age);

}
