package com.junseok.blog.home.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.apache.poi.openxml4j.opc.internal.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


public class HomeControllerTest {
	
	private MockMvc mockMvc;
	
	void setup(WebApplicationContext wac) {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@BeforeEach
	void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();
	}
	
	void testHome() throws Exception {
		this.mockMvc.perform(get("/home.do"))
			.andExpect(status().isOk())
			.andExpect(view().name("home"))
			.andDo(MockMvcResultHandlers.print())
			.andReturn();
	}
	
	public void testMessage() throws Exception {
		this.mockMvc.perform(get("/message")).andExpect(status().isOk())
				.andExpect(content().string("Test Message Success!"))
				.andDo(MockMvcResultHandlers.print());
	}
	
	@Test
	void testResponseEntity() throws Exception {
		this.mockMvc.perform(post("/responseEntity").param("param", "파람스값").param("params", "파람스값")
				.accept(MediaType.parseMediaType(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE + "; charset=UTF-8")
				.characterEncoding("UTF-8"))
				.andExpect(status().isOk())
				.andExpect(status().isOk())
//				.andExpect(jsonPath("$.param").value("파람스값"))
				.andExpect(content().encoding("UTF-8"))
				.andDo(MockMvcResultHandlers.print());
	}

}
