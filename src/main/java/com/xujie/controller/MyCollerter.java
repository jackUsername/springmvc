package com.xujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller

public class MyCollerter {
/**处理器方法返回ModelandView，实现转发forWord

 语法:serViewName("forward:视图文件的完整路径")
    farward特点：不和视图解析器一同使用，就当项目中没有视图解析器
    */

    @RequestMapping(value = "/some.do")
    public  ModelAndView doSome(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("key","holle SpringMvc");
        mv.addObject("key2","doSome方法执行了");

        //显示转发
        mv.setViewName("forward:/WEB-INF/view/show.jsp");
        return mv;
    }

    /**
     * 处理器返回值ModelAndview,实现重定向redirect
     * 语法:serViewName（"redirect:视图完整路径）
     * redirect:不和视图解析器一同使用，就当项目中没有视图解析器
     *
     * 框架对重定向操作：
     * 1.框架会把Model中的简单类型的数据，转为String使用，作为other.jsp的get请求参数使用
     * 目的是：可以在Redirect.do和onther.jsp.两次请求之间传递数据
     * @return
     */

    @RequestMapping(value = "/Redirect.do")
    public  ModelAndView doWithRedirect(String name,Integer age){
        ModelAndView mv=new ModelAndView();
        //数据放在到，request作用域
        mv.addObject("key",name);
        mv.addObject("key2",age);

        //显示转发
        //重定向不能访问/WEB-INF-view/other.jsp
        mv.setViewName("redirect:/other.jsp");
        //http：//locathost:8080/ other.jsp?myname=lisi&myage=22
        return mv;
    }
}
