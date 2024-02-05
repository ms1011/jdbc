package com.ohgiraffers.section02.template;

import java.sql.Connection;

/* 설명. import 뒤에 static 을 붙이고 메소드명까지 쓰게 되면 다른 클래스의 static 메소드를 마치 내 class에 있는 것 처럼 사용할 수 있다 */
import static com.ohgiraffers.section02.template.JDBCTemplate.*;

/* 수업목표. Connection과 close 과정을 모듈화하여 호출할 수 있다 */
public class Application {
    public static void main(String[] args) {
        Connection con = getConnection();

        /* 설명. 비즈니스 로직 실행 */

        System.out.println("con = " + con);

        close(con);
    }
}
