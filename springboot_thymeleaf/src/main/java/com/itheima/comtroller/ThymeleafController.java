package com.itheima.comtroller;

import com.itheima.pojo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @GetMapping("/to")
    public ModelAndView toThyme(ModelAndView modelAndView) {
        modelAndView.setViewName("form");
        modelAndView.addObject("name", "suuuuuuuuuuuuuuuuuuu-");
        return modelAndView;
    }

    @GetMapping("/to2")
    public String toThyme2(Model model) {
        model.addAttribute("name", "wuuuu ~ uu");
        return "form";
    }

    @GetMapping("/getFormData")
    public String getFormDate(Model model, String data) {
        System.out.println("data = " + data);
        model.addAttribute("str", data);
        return "form";
    }

    @GetMapping("/addUser")
    public String addUser(Model model){
        UserInfo userInfo = new UserInfo(1,"geria",20);
        model.addAttribute("user",userInfo);
        return "user";
    }

    @GetMapping("/addList")
    public String addList(Model model){
        UserInfo userInfo = new UserInfo(1,"gorza",20);
        UserInfo userInfo2 = new UserInfo(2,"pipe",11);
        UserInfo userInfo3 = new UserInfo(3,"baaz",30);
        List<UserInfo> userInfoList = new ArrayList<>();
        Collections.addAll(userInfoList,userInfo,userInfo2,userInfo3);
        model.addAttribute("userInfoList",userInfoList);
        return "list";
    }

    @GetMapping("/addArray")
    public String addArray(Model model){
        String[] names = {"张三","李四","王五"};
        model.addAttribute("names",names);
        return "array";
    }

    @GetMapping("/addMap")
    public String addMap(Model model){
        Map<String,Object> map = new HashMap<>();
        map.put("province","湖北省");
        map.put("city","武汉市");
        map.put("area","黄陂区");
        model.addAttribute("dataMap",map);
        return "map";
    }

    @GetMapping("/addDate")
    public String addDate(Model model){
        model.addAttribute("date",new Date());
        return "date";
    }

    @GetMapping("/takeIf")
    public String takeIf(Model model){
        model.addAttribute("num",1);
        return "if";
    }

    @GetMapping("/takeUnless")
    public String takeUnless(Model model){
        model.addAttribute("num",1);
        return "unless";
    }

    @GetMapping("/include")
    public String include(){
        return "include";
    }
}
