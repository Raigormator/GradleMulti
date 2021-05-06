package com.gradle.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.apache.commons.lang3.StringUtils;

public class SayServiceImpl {

	public String greeting(String args) throws IOException {
		String language = StringUtils.upperCase(args);

        InputStream resourceStream = null;
        if ("ENGLISH".equals(language)) {
        	resourceStream = SayServiceImpl.class.getClassLoader().getResourceAsStream("en.txt");
        } else if ("FILIPINO".equals(language)) {
        	resourceStream = SayServiceImpl.class.getClassLoader().getResourceAsStream("ph.txt");
        } else {
            return StringUtils.EMPTY;
        }

        assert resourceStream != null;
        BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(resourceStream, StandardCharsets.UTF_8));

        return bufferedInputStream.readLine();
	}

}