package com.CaseStudy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.CaseStudy.entities.User;
import com.CaseStudy.services.UserService;

class UserDAOtest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddUser() {
		User user = new User();
		user.setUserEmail("user1@gmail.com");
		user.setPassword("password1234");
		UserService userservice = new UserService();
		
		int expected = 1;
		int actual = userservice.addUserService(user);
		assertEquals(expected, actual); 
		
	}
	

	/* 
	
	@Test
	void testGetUserById() {
		fail("Not yet implemented");
	} 

	@Test
	void testGetUserSongs() {
		fail("Not yet implemented");
	}
	
	*/

}
