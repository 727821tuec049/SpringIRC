package com.example.Day01.Valueano;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Valuano {
	@Value("${carname:'BMW'}")
public String car;
	@GetMapping("/kar")
	@ResponseBody
public String car()
{
	return "My fvrt car "+car;
}
}