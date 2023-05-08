package com.example.Mapping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mapping.Model.Question;
import com.example.Mapping.Repository.QuestionRepo;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	QuestionRepo qrepo;
	@Tag(name="QuestionDetails")
		@PostMapping("/Q")
	public String javaDetails(@RequestBody Question q)
	{
		qrepo.save(q);
		return "Data is saved";
	}
	@Tag(name="GetQuestionDetails")
	@GetMapping("/g")
	public List<Question>showQuAns()
	{
		return qrepo.findAll();
	}
			

}
