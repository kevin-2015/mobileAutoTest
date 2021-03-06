package com.bmtc.device.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class ExecuteCmdUtils {

	public static StringBuffer executeCmd(String shell) {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = null;

		try {
			Process ps = Runtime.getRuntime().exec(shell);
			br = new BufferedReader(new InputStreamReader(ps.getInputStream()));

			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line).append("\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return sb;
	}

	public static List<String> runShell(String shell) {
		List<String> streamData = null;

		try {
			Process ps = Runtime.getRuntime().exec(new String[]{"/bin/sh","-c",shell},null,null);
			StreamWatch inputStream = new StreamWatch(ps.getInputStream());
			inputStream.setName("inputStream");
			StreamWatch errorStream = new StreamWatch(ps.getErrorStream());
			errorStream.setName("errorStream");
			inputStream.start();
			errorStream.start();
			int status = ps.waitFor();

			if (status == 0) {
				streamData = inputStream.getStream();
			} else {
				streamData = errorStream.getStream();
			}
			ps.destroy();
		} catch (Exception e) {
			e.printStackTrace();

		} 
		return streamData;
	}
	
	public static List<String> execute(String shell) {
		List<String> streamData = null;
		try {
			Process ps = Runtime.getRuntime().exec(shell);
			StreamWatch inputStream = new StreamWatch(ps.getInputStream());
			inputStream.setName("inputStream");
			StreamWatch errorStream = new StreamWatch(ps.getErrorStream());
			errorStream.setName("errorStream");
			inputStream.start();
			errorStream.start();
			int status = ps.waitFor();

			if (status == 0) {
				streamData = inputStream.getStream();
			} else {
				streamData = errorStream.getStream();
			}
			ps.destroy();
		} catch (Exception e) {
			e.printStackTrace();

		} 
		return streamData;
	}
	
	public static boolean execute(String shell, boolean flag) {
		try {
			Process ps = Runtime.getRuntime().exec(shell);
			StreamWatch inputStream = new StreamWatch(ps.getInputStream());
			inputStream.setName("inputStream");
			StreamWatch errorStream = new StreamWatch(ps.getErrorStream());
			errorStream.setName("errorStream");
			inputStream.start();
			errorStream.start();
			int status = ps.waitFor();
			if (status == 0) {
				flag = true;
			} else {
				flag = false;
			}
			ps.destroy();
		} catch (Exception e) {
			e.printStackTrace();

		} 
		return flag;
	}
	
	public static boolean execute(List<String> shell) {
		boolean flag = false;
		try {
			ProcessBuilder pb = new ProcessBuilder(shell).redirectErrorStream(true);
			Process ps = pb.start();
			StreamWatch inputStream = new StreamWatch(ps.getInputStream());
			inputStream.setName("executeStream");
			inputStream.start();
			int status = ps.waitFor();
			if (status == 0) {
				flag = true;
			} else {
				flag = false;
			}
			ps.destroy();
		} catch (Exception e) {
			e.printStackTrace();

		} 
		return flag;
	}
	
}
