package com.gmail.manavbrar.primitivearray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AppTest {

	/**
	 * @return the suite of tests being tested
	 */
	public static int[] intdata() {
		final int[] start = { 3, 24, 12 };
		return start;
	}

	@ParameterizedTest
	@MethodSource("intdata")
	public void testApp(final int value) {
		assertThat("array value mismatch", value, not(equalTo(0)));
	}

}
