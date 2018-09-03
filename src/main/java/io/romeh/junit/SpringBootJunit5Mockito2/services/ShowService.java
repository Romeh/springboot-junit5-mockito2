package io.romeh.junit.SpringBootJunit5Mockito2.services;

import org.springframework.stereotype.Service;

/**
 * @author romeh
 */
@Service
public class ShowService {

	private final TextService textService;

	public ShowService(TextService textService) {
		this.textService = textService;
	}

	public String getShowLable() {

		return textService.getText();

	}
}
