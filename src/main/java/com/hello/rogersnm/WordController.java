package com.hello.rogersnm;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.services.WordServices;

@RestController
@RequestMapping(value = "/words")
public class WordController {

	@Autowired
	protected WordServices wordServices;

	@GetMapping(value = "{word}", produces = MediaType.APPLICATION_JSON_VALUE)
	protected Map<String, Object> ispolindrome(@PathVariable(value = "word") String word) {
		Map<String, Object> res = new HashMap<>();
		res.put("word", word);
		res.put("palindrome", wordServices.validatePalindrom(word));
		res.put("anagramOfPalindrome", wordServices.validateAnagramOfPalindrome(word));

		return res;
	}

}
