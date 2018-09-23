package com.rakesh.testing.Bablodocs1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ApiController {
	
	@RequestMapping(value="/testing",method=RequestMethod.GET,produces={"application/json"})
	public @ResponseBody String testingResponse(){
		return "Hi Test Successful";
	}

}
