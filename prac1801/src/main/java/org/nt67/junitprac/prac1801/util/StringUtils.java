package org.nt67.junitprac.prac1801.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	private static String SNAKE_CASE_DELIMITER = "_";

	public static String toSnakeCase(String target){
		if(target == null){
			return null;
		}

		String snake = target;
		Pattern p = Pattern.compile("([A-Z])");
		for(;;){
			Matcher m = p.matcher(snake);
			if(!m.find()) {
				break;
			}
			snake = m.replaceFirst(SNAKE_CASE_DELIMITER + m.group(1).toLowerCase());
			System.out.println(m.group(1));
		}

		return snake.replaceFirst("^_", "");
	}

}
