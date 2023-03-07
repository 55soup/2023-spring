package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    // 상수 필드의 경우 생성자에서 대입은 허용하므로 final로 설정
}
