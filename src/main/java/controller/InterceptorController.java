package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController {
    @RequestMapping("/a")
    public void a(){
        System.out.println("我是Controller中的a方法");
    }
}
