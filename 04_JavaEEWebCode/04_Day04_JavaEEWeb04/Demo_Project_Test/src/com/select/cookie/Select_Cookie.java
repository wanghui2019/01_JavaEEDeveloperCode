package com.select.cookie;

import javax.servlet.http.Cookie;

public class Select_Cookie {
	public static Cookie selectCookie(Cookie[] cookies,String key) {
		for (Cookie cookie : cookies) {
			String name = cookie.getName();
			if (name.equals(key)) {
				return cookie;
			}
		}
		
		return null;	
	}
}
