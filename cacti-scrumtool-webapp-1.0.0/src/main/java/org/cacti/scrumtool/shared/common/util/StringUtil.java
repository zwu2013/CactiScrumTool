package org.cacti.scrumtool.shared.common.util;

/**
 * 
 * @author zwu
 *
 */

public class StringUtil {

	/**
	 * 1. trim input
	 * 2. remove tab
	 * 3. remove empty line
	 * 
	 * @param input
	 * @return
	 */
	public static String reformatValue(String input){
		
		input = input.trim();
		input = input.replaceAll("[\t]", "");
		input = input.replaceAll("[\n\r]+", "");
		
		return input;
	}

}
