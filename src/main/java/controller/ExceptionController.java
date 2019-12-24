package controller;

import excption.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
    @RequestMapping("/my1")
    public void my1(){
        int i = 1,b=0;
        System.out.println(i/b);
    }

    @RequestMapping("/my2")
    public void my2() throws MyException {
        int i = 1,b=0;
        if (b==0){
            throw new MyException("分母为0了");
        }else {
            System.out.println(i/b);
        }
    }
}
