package org.nt67.junitprac.prac1801.util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class StringUtilsTest {
	@DataPoints
	public static ToSnakeCaseFixture[] TO_SNAKE_CASE_FIXTUREs = {
		//new ToSnakeCaseFixture("a", "a"),
		new ToSnakeCaseFixture("aaa", "aaa"),
		new ToSnakeCaseFixture("abc", "abc"),
		new ToSnakeCaseFixture("a1c", "a1c"),
		new ToSnakeCaseFixture("testMethod", "test_method"),
		new ToSnakeCaseFixture(null, null),
		new ToSnakeCaseFixture("ManyManyManyManyWords", "many_many_many_many_words")
	};

	@Theory
	public void toSnakeCaseTest(ToSnakeCaseFixture fixture) {
		assertThat(StringUtils.toSnakeCase(fixture.arg), is(fixture.expected));
	}

	static class ToSnakeCaseFixture {
		String arg;
		String expected;
		ToSnakeCaseFixture(String arg, String expected){
			this.arg = arg;
			this.expected = expected;
		}
	}

}
