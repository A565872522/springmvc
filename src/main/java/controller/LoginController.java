package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@RestController
public class LoginController {
    @RequestMapping("/reg")
    public void reg(HttpServletRequest req, HttpServletResponse resp, @RequestParam String name1, @RequestParam String password1){
        try {
            //设置编码
            req.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=utf-8");
            //接收参数,获得session对象
            HttpSession session = req.getSession();
            if(name1!=""&&password1!=""){
                //处理业务逻辑
                session.setAttribute("name",name1+"&"+password1);
                resp.getWriter().println("注册成功");
                System.out.println("注册成功");
            }else {
                resp.getWriter().println("注册失败，不可有内容为空");
                System.out.println("注册失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/login")
    public void login(HttpServletRequest req,HttpServletResponse resp,@RequestParam String name2,@RequestParam String password2){
        try {
            req.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=utf-8");
            HttpSession session = req.getSession();
            String s1 = (String) session.getAttribute("name");
            String s2 = name2+"&"+password2;
            System.out.println("姓名："+name2);
            if(s1.equals(s2)){
                resp.getWriter().println("登陆成功");
                System.out.println("登陆失败");
            }else {
                resp.getWriter().println("登陆失败，账户或密码输入错误且不可有内容为空");
                System.out.println("登陆失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/reg2")
    public void reg2(HttpServletRequest req,HttpServletResponse resp,@RequestParam String name3,@RequestParam String password3){
        try {
            req.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=utf-8");
            //处理业务逻辑
            if(name3!=""&&password3!=""){
                Cookie cookie = new Cookie("name",name3+"&"+password3);
                cookie.setPath("/");
                cookie.setMaxAge(60*60*24);
                resp.getWriter().println("注册成功");
            }else{
                resp.getWriter().println("注册失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/login2")
    public void login2(){

    }
}
