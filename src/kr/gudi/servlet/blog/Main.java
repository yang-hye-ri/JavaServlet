package kr.gudi.servlet.blog;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gudi.util.Commons;

@WebServlet("/blog/Main")
public class Main extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Commons.sendViewJSP(req, res, "blog/main");
	}

}
