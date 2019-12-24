package controller;

import entity.Student;
import mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    StudentMapper sm;

    @Transactional(propagation= Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    public void test2(){
        Student stu = new Student("牡丹",18);
        int n = sm.insert(stu);
        if(n>0){
            System.out.println("插入数据成功");
        }
    }

}
