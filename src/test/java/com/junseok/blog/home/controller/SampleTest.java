package com.junseok.blog.home.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.junseok.blog.home.service.MyService;


@ExtendWith(SpringExtension.class)
@ContextConfiguration("servlet-context.xml")
public class SampleTest {
	
	@Autowired
	private MyService myService;

	@BeforeAll
	static void initAll() {
		System.out.println("---Inside initAll---");
	}

	@BeforeEach
	void init(TestInfo testInfo) {
		System.out.println("Start..." + testInfo.getDisplayName());
	}

	@Test
	public void messageTest() {
		String msg = myService.getMessage();
		assertEquals("Hello World!", msg);
	}

	@Test
	public void multiplyNumTest() {
		int val = myService.multiplyNum(5, 10);
		assertEquals(50, val);
	}

	@Test
	public void idAvailabilityTest() {
		boolean val = myService.isIdAvailable(100);
		assertTrue(val);
	}

	@AfterEach
	void tearDown(TestInfo testInfo) {
		System.out.println("Finished..." + testInfo.getDisplayName());
	}

	@AfterAll
	static void tearDownAll() {
		System.out.println("---Inside tearDownAll---");
	}

}
