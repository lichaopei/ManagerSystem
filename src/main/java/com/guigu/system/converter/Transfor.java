package com.guigu.system.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transfor {
	public static Date change(Date date) {
		SimpleDateFormat s=new SimpleDateFormat("HH:mm:ss");
		try {
			return s.parse(date.toString());
		} catch (ParseException e) {
		}
		return null;
		
	}

}
