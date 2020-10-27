package com.jxd.emp.controller;

import com.jxd.emp.model.Dept;
import com.jxd.emp.model.Emp;
import com.jxd.emp.service.IDeptService;
import com.jxd.emp.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName EmpController
 * @Description TODO
 * @Author wang kunpeng
 * @Date 2020/10/22
 * @Version 1.0
 */

@Controller
public class EmpController {

    @Autowired
    private IEmpService empService;

    @Autowired
    private IDeptService deptService;


    @Value("${name}")
    private String name;

    @Value("${student.sname}")
    private String sname;

    @Value("${persons[0].pname}")
    private  String pname;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(name);
        System.out.println(sname);
        System.out.println(pname);
        return "Hello SpringBoot!!热部署测试";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello SpringBoot!!热部署测试";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Emp> getAll(){
        return empService.getAll();
    }

    @RequestMapping("/getDept")
    @ResponseBody
    public List<Dept> getDept(){
        //创建一个条件构造器对象

        return deptService.list();
    }

    @RequestMapping("/hellbeetl")
    public String helloBeetl(Model model){
        model.addAttribute("msg","hellobeelt");
        return "hello.btl";
    }

    @RequestMapping("/hello02")
    public String hellobeetl02(Model model){
        model.addAttribute("msg","<h1>html模板文件</h1>");
        return "hello02.html";
    }

    @RequestMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("msg","</h1>改变了模板位置</h1>");
        List<Dept> list = deptService.list();
        model.addAttribute("list",list);
        return "viewcome.html";
    }

    @RequestMapping("/login/{uname}/{pwd}")
    @ResponseBody
    public String login(@PathVariable("uname") String uname, @PathVariable("pwd") String pwd){
        if ("admin".equals(uname) && "123".equals(pwd)){
            return "success";
        }else {
            return "error";
        }
    }
}
