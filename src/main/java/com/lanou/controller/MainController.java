package com.lanou.controller;

import com.lanou.bean.Student;
import com.lanou.service.StudentService;
import com.lanou.utils.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lizhongren1 on 2017/12/6.
 */
@Controller
public class MainController {

//玩儿体育iOS的法国红酒空心菜VB你们尽快BGVuuu各方面巨化股份的个刚刚长途车
    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/home")
    public String frontPage(){

        return "home";
    }

    @ResponseBody
    @RequestMapping(value = "/allstu")
    public AjaxResult findStu(){

        return new AjaxResult(studentService.findAllStu());
    }

}
