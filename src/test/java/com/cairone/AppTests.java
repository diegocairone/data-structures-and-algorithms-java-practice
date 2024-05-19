package com.cairone;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AppTests {

	@Test
	void contextLoads() {
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		Integer max = list.stream()
				.max(Integer::compareTo).get();
	}

}
