package util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
	
	public static Properties readTestProperties(String fileName) {
		Properties props = new Properties();
		InputStream in = null;
		try {
			in = new FileInputStream(fileName);
			props.load(in);			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {			
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return props;
	}
}
