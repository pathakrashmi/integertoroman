package com.example.integertoroman;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanNumberController {
	
	/*private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	RomanNumber greeting(@RequestParam String name) {
		return new RomanNumber(counter.incrementAndGet(), String.format(template, name));
	}*/
	
	@RequestMapping("/romannumeral")
    public RomanNumber romanNumeral(@RequestParam(value="query", defaultValue="1") Integer query) {
        if (query < 1 || query > 10000000) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requested roman numeral is not between 1 and 10000000");
        }
        return new RomanNumber(query);
    }

}
