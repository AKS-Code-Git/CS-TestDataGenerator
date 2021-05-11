package com;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public final class PropUtil {

	private static String jsonFile;
	private static long pause;
	public static String USR_DIR = System.getProperty("user.dir");
	private static long loop;

	public static void readProperties() {
		try {
			FileReader reader = new FileReader(USR_DIR + "/test.properties");
			Properties p = new Properties();
			p.load(reader);
			PropUtil.jsonFile = p.getProperty("JSON_FILE");
			PropUtil.pause = Long.valueOf(p.getProperty("PAUSE")).longValue();
			PropUtil.loop = Long.valueOf(p.getProperty("LOOP")).longValue();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the jsonFile
	 */
	public static final String getJsonFile() {
		return jsonFile;
	}

	/**
	 * @return the pause
	 */
	public static final long getPause() {
		return pause;
	}

	/**
	 * @return the loop
	 */
	public static final long getLoop() {
		return loop;
	}

}
