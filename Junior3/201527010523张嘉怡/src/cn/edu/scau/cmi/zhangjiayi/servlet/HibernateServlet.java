package cn.edu.scau.cmi.zhangjiayi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HibernateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		String id = request.getParameter("hibrenateStuId");
		System.out.println("yes!!!!!!!");
		System.out.println(id);
	}
}
