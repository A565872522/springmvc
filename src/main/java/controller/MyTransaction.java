package controller;

        import entity.Student;
        import excption.MyException;
        import mapper.StudentMapper;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.transaction.annotation.Propagation;
        import org.springframework.transaction.annotation.Transactional;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;
        import serviceImpl.StudentServiceImpl;

@RestController
public class MyTransaction {

    @Autowired
    StudentMapper sm;

    @Autowired
    TestController tc;

    @RequestMapping("/test1")
    //表示当前方法开启一个事务
    @Transactional(rollbackFor = Exception.class)
    public void test1(){
        Student stu = new Student("玫瑰",18);
        int n = sm.insert(stu);
        if(n>0){
            System.out.println("数据插入成功");
        }
        tc.test2();

        int a = 2/0;

    }

}
