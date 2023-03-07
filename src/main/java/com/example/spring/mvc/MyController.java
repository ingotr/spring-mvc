package com.example.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String returnMyView() {
        return "myView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "askEmployeeDetailsView";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//        String employeeName = request.getParameter("employeeName");
//        employeeName = "Mr. " + employeeName;
//        model.addAttribute("nameAttribute", employeeName);
//
//        return "showEmployeeDetailsView";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String employeeName, Model model) {
        employeeName = "Mr. " + employeeName;
        model.addAttribute("nameAttribute", employeeName);

        return "showEmployeeDetailsView";
    }
}
