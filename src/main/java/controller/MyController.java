package controller;

import entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

//@Controller
//@ResponseBody
@RestController  //等价于@Controller+@ResponseBody
public class MyController {
    //RequestMapping会根据请求名找到对应的方法
    @RequestMapping("/add")
    public void add(){
        System.out.println("我是add()方法");
    }

    @RequestMapping("/delete")
    public void delete(){
        System.out.println("我是delete()方法");
    }

    @RequestMapping("/hello")
    public String hello(Model mv){
        //ModelAndView数据+模型对象，可以绑定数据到指定页面
        mv.addAttribute("name","ACE");

        return "my";
    }

    @RequestMapping("/hello2")
    public ModelAndView hello2(ModelAndView mv){
        mv.addObject("name","hello2");
        mv.setViewName("my");
        return mv;
    }

    @RequestMapping("/hello3")
       //该注解 返回的是json格式的字符串而非页面
    public String hello3(){

        return "my";
    }

    @RequestMapping("/stu1")
    public Student Student(){
        Student stu=new Student("张三",23);

        return stu;
    }

    @RequestMapping("/stu2")
    public List<Student> mylist(){
        List<Student> list=new ArrayList<Student>();
        Student stu1=new Student();
        Student stu2=new Student();
        stu1.setName("张三");
        stu1.setAge(20);
        stu2.setName("李四");
        stu2.setAge(25);
        list.add(stu1);
        list.add(stu2);
        return list;
    }

    @RequestMapping("/stu3")
    public int mini(HttpServletRequest req, @RequestParam String name1,@RequestParam String age1){
        try {
            req.setCharacterEncoding("utf-8");
            System.out.println("名字："+name1+","+"年龄："+age1);
            if (name1==""||age1==""){
                return 0;
            }else {
                return 1;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return 2;
    }

    @RequestMapping("/stu4")
    public Student stu4(HttpServletRequest req){
        try {
            req.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        int a = Integer.parseInt(age);
        System.out.println(username);
        System.out.println(age);
        Student stu = new Student(username,a);
        return stu;
    }
}

