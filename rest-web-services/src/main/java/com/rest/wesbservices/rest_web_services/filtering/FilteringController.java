package com.rest.wesbservices.rest_web_services.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

	@GetMapping("/filtering-list")
	public List<SomeBean> doFilteringList() {

		return Arrays.asList(new SomeBean("1", "2", "3", "4"), new SomeBean("5", "6", "7", "8"));
	}
}
