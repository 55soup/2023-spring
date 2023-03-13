package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // Bean이 필요해서 요청할 때마다 새 bean을 가져옴.
public class MyBean {
}
