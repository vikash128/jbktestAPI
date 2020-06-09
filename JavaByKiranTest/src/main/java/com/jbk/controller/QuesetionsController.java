package com.jbk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testapi")
public class QuesetionsController {
	
	public Quesetion getQuesetions() {
		Quesetion quesetion = new Quesetion(); // This is just dummy code.
		quesetion.setQuestionText("Java is plateform independent ?");
		quesetion.setOptions1("Yes");
		quesetion.setOptions2("No");
		quesetion.setCorrectOptions("1");
		quesetion.setExplanation("Due to byte code...Java is os independent.");
		return quesetion;
	}

}
