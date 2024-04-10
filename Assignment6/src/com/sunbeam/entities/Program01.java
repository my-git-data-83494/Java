package com.sunbeam.entities;
import java.util.Scanner;
public class Program01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringLength s = new StringLength();
		s.accept(sc);
		try {
			s.display();
		} catch (ExceptionLineTooLong e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
