package com.shms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestService testService;
	
	@GetMapping
	public String getDate() {
		return testService.getDate();
	}
	// travis test
	@GetMapping("/wear")
	public List<WearLog> getWearLog() {
		return testService.selectAll();
	}
}
