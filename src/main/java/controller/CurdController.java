package controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurdController {
    @RequestMapping("/add2")
    public int add(@RequestParam Integer a){
        System.out.println("我是add()方法");
        a=1;
        int s = 2/0;
        return 1;
    }

//    @RequestMapping("/delete2")
//    public void delete(){
//        System.out.println("我是delete()方法");
//    }


    @RequestMapping("/curry")
    public void test(Integer a){
        Logger log = Logger.getLogger(CurdController.class);
        log.debug("我代替了System.out");
    }
}
