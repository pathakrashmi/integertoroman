package com.example.integertoroman;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class RomanNumberController implements ErrorController{
	
	private final static String PATH = "/error";
	
	/**
     	* This method is responsible for converting integer numbers into its equivalent roman numeral
     	*
     	* @param  number integer number (range 1-3999)
     	* @return roman equivalent of integer number 
     	*/
	@RequestMapping("/romannumeral")
    	public RomanNumber romanNumeral(@RequestParam(value="query") Integer query) {
        	if (query < 0 || query > 4000) {
            	throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "This utility supports integer-roman conversion only for the range 1-3999");
        	}
        	return new RomanNumber(query);
    	}

	@Override
	@RequestMapping(PATH)
    	@ResponseBody
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "This App is built to convert intergers in range 1 to 3999";
	}

}
