package com.vis.finance.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class ReadWriteUtil {

	private static String createXml() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "initial_value";
		String parent = null;
		String currentFieldName = null;
		StringBuffer buf = new StringBuffer();
		int counter = 0;
		while (Objects.nonNull(line) && !line.equalsIgnoreCase("")) {
			counter++;
			if (counter == 1) {
				System.out.println("<Enter xml field name>");
				line = br.readLine();
				parent = line.trim();
				if (parent.equalsIgnoreCase("")) {
					break;
				}
				buf.append("<" + parent + ">");
			} else if (counter%2 == 0) {
				System.out.println("<Enter xml field name>");
				line = br.readLine();
				currentFieldName = line.trim();
				if (currentFieldName.equalsIgnoreCase(parent)) {
					buf.append("</" + parent + ">");
					return buf.toString();
				} else if (currentFieldName.equalsIgnoreCase("")) {
					break;
				}
				buf.append("<" + currentFieldName + ">");
			} else {
				System.out.println("<Enter xml field value>");
				line = br.readLine();
				buf.append(line.trim());
				buf.append("</" + currentFieldName + ">");
				line = line.equalsIgnoreCase("") ? "initial_value" : line;
			}
		}
		return null;
	}
	
	public static String getCustomXml() throws IOException {
		String xml = createXml();
		System.out.println(xml);
		return xml;
	}
}
