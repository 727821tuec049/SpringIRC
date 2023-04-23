package com.example.Day01.classex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Student {
	@RequestMapping("/")
	@ResponseBody
public String welcome()
{
	return"Welcome to class";
}
}
