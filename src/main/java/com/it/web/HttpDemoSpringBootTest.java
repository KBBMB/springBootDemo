package com.it.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import org.springframework.test.context.junit4.SpringRunner;
import com.it.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HttpDemoSpringBootTest.class)
public class HttpDemoSpringBootTest {

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void httpGet() {
		User user = this.restTemplate.getForObject("http://localhost/hello", User.class);
		System.out.println(user);
	}
}
