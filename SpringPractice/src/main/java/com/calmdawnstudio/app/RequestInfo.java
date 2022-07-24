package com.calmdawnstudio.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestInfo {
	@RequestMapping("/requestInfo")
	public void main(HttpServletRequest request) {
		System.out.println("request.getMethod()="+request.getMethod());      // 요청 방법
        System.out.println("request.getProtocol()="+request.getProtocol());  // 프로토콜의 종류와 버젼 HTTP/1.1
        System.out.println("request.getScheme()="+request.getScheme());      // 프로토콜
	}
}
