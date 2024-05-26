package com.example.SpringMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called!");
        return "index";
    }

    @RequestMapping("/alien")
    public String homeAlien(){
        return "index1";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        //System.out.println("in add");
//        var num1  = Integer.parseInt(req.getParameter("num1"));
//        var num2 =  Integer.parseInt(req.getParameter("num2"));
//        var result = num1 + num2;
//        session.setAttribute("result", result);
//        System.out.println(result);
//        return "result.jsp";
//    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int number1,@RequestParam("num2") int number2, HttpSession session){
//        //System.out.println("in add");
//
//        var result = number1 + number2;
//        session.setAttribute("result", result);
//        System.out.println(result);
//        return "result.jsp";
//    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int number1,@RequestParam("num2") int number2, Model model){
//        //System.out.println("in add");
//
//        var result = number1 + number2;
//        model.addAttribute("result", result);
//        System.out.println(result);
//        return "result";
//    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int number1,@RequestParam("num2") int number2, ModelAndView mv){
        //System.out.println("in add");

        int result = number1 + number2;
        mv.addObject("result", result);
        mv.setViewName("result");
        System.out.println(result);
        return mv;
    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid,@RequestParam("aname") String aname, ModelAndView mv){
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//        mv.addObject("alien", alien);
//        mv.setViewName("result1");
//        System.out.println(alien);
//        return mv;
//    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("alien1") Alien alien){
        //course = "Java";
        return "result1";
    }

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }
}


// /Users/user/Projects/SpringProject


//chmod a+x /Users/user/Projects/apache-tomcat-10.1.24bin/catalina.sh