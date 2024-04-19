package ru.den_ostap.learning.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/Learn-platform")
    public String goToIndex() {
        return "index";
    }

    @GetMapping("/ready-courses")
    public String goToReadyCourses() {
        return "ready_courses";
    }

    @GetMapping("/create-course")
    public String goToCreateCourse() {
        return "create_course";
    }

    @GetMapping("/resources")
    public String goToResources() {
        return "resources";
    }

    @GetMapping("/resources/topic")
    public String goToTopic() {
        return "ready_courses";
    }


}
