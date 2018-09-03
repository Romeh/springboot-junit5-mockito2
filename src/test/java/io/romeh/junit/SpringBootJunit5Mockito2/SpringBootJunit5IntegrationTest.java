package io.romeh.junit.SpringBootJunit5Mockito2;


import static io.romeh.junit.SpringBootJunit5Mockito2.services.TextService.ORIGINAL_OUTPUT;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import io.romeh.junit.SpringBootJunit5Mockito2.services.ShowService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SpringBootJunit5IntegrationTest {

	@Autowired
	private ShowService showService;

	@Test
	@DisplayName("Integration test which will get the actual output of text service")
	public void contextLoads() {
		assertEquals(showService.getShowLable(), ORIGINAL_OUTPUT);
	}

}
