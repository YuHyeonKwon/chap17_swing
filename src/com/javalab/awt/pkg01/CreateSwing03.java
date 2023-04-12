package com.javalab.awt.pkg01;

/**
 * JFrame 객체를 상속해서 만들기
 */

import javax.swing.JButton;
import javax.swing.JFrame;

public class CreateSwing03 extends JFrame { // JFrame 상속

	// 필드
	JFrame frame;

	// 기본 생성자
	public CreateSwing03() {
		JButton b = new JButton("click"); // 버튼 객체 생성
		b.setBounds(130, 100, 100, 40);

		add(b); // JFrame을 상속받았기 떄문에 JFrame이 갖고 있는 add메소드 바로 사용
		setSize(400, 500);
		setLayout(null);
		setVisible(true);
	}

	// 메인 메소드에서 객체 생성해서 사용함
	public static void main(String[] args) {
		new CreateSwing03();
	} // main e
} // class e
