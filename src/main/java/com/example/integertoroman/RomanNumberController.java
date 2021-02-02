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
	
	@RequestMapping("/romannumeral")
    public RomanNumber romanNumeral(@RequestParam(value="query", defaultValue="1") Integer query) {
        if (query < 1 || query > 4000) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requested roman numeral is not between 1 and 4000");
        }
        return new RomanNumber(query);
    }

	@Override
	@RequestMapping(PATH)
    @ResponseBody
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "This App is built to convert intergers in range 1 to 4000";
	}

}
