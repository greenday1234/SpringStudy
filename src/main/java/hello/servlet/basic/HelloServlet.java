package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")  // /hello url 로 오면 해당 메소드 실행
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service"); // 실행 확인
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username"); //쿼리 파라미터 조회
        System.out.println("username = " + username);

        //응답 메시지
        response.setContentType("text/plain");  //단순 문자, 헤더 정보
        response.setCharacterEncoding("utf-8"); //인코딩 정보, 헤더 정보
        response.getWriter().write("hello " + username);
    }
}
