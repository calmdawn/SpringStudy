package com.calmdawnstudio.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. ����ȣ�� ������ ���α׷����� ��� @Controller
@Controller
public class Hello {
	// 2. URL�� �޼��带 ���� @RequestMapping
	@RequestMapping("/hello")
	public void main() {
		System.out.println("Hello");
	}
}
