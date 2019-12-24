package serviceImpl;

import entity.Student;
import mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper sm;

    @Override
    public Student selectById(Integer id) {
        return sm.selectById(id);
    }

    @Override
    public int insert(Student student) {
        return sm.insert(student);
    }

    @Override
    public int delete(Integer id) {
        return sm.delete(id);
    }

    @Override
    public int modify(Student student) {
        return sm.modify(student);
    }

    @Override
    public Student selectByNameAndAge(String name, Integer age) {
        return sm.selectByNameAndAge(name,age);
    }
}
