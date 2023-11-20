package com.example.inputapp.inputq;

import java.util.Scanner; // Scanner 클래스를 import

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        System.out.print("입력할 문자열: "); // 입력 안내 문구 출력
        String input = sc.nextLine(); // 문자열 입력받기
        sc.close(); // Scanner 객체 닫기
        // 입력값이 1393이거나 ㅈㅅ, 살자, 뒤지고싶다, 힘들다, 너무힘들어, 우울해, 불안해 중 하나일 때는 ???+inputvalue를 출력하지 않고, 뒤에 값만 출력하기
        if (input.equals("1393") || input.equals("ㅈㅅ") || input.equals("살자") || input.equals("뒤지고싶다") || input.equals("힘들다") || input.equals("너무힘들어") || input.equals("우울해") || input.equals("불안해")) {
            System.out.println("당신은 혼자가 아닙니다. 1393으로 연락하세요"); // 입력값이 1393이거나 ㅈㅅ, 살자, 뒤지고싶다, 힘들다, 너무힘들어, 우울해, 불안해 중 하나일 때 당신은 혼자가 아닙니다. 1393으로 연락하세요를 출력하기
        } else {
            System.out.print("???"+input); // 입력값이 위의 경우에 해당하지 않을 때 입력값 앞에 ???를 붙여서 출력하기
            // 입력값에 따라 뒤에 다른 문구를 추가하기
            if (input.equals("야근해") || input.equals("야근") || input.equals("오늘 회식") || input.equals("집가고싶다") || input.equals("쉬고싶다") || input.equals("출근안하냐") || input.equals("칼퇴")) {
                System.out.println("(....)"); // 입력값이 야근해, 야근, 오늘 회식, 집가고싶다, 쉬고싶다, 출근안하냐, 칼퇴 중 하나일 때 (....)를 추가로 출력하기
            } else {
                System.out.println(); // 입력값이 위의 경우에 해당하지 않을 때는 아무것도 추가로 출력하지 않기
            }
        }
    }
}
