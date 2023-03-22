package com.ezen.view.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   private HandlerMapping handlerMapping;
   private ViewResolver viewResolver;
       
    @Override
   public void init() throws ServletException {
       handlerMapping = new HandlerMapping();
       viewResolver = new ViewResolver();
       viewResolver.setPrefix("./");
       viewResolver.setSuffix(".jsp");
   }

   /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
      process(request,response);
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("utf-8");
      process(request,response);
   }
   
   private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
      //1. 클라이언트의 요청을 분석
      String uri = request.getRequestURI();
      //System.out.println("uri"+uri);
      
      String path = uri.substring(uri.lastIndexOf('/'));
      
      //2. HandlerMapping 을 통해path 에 해당하는 Controller 검색
      Controller controller = handlerMapping.getController(path);
      
      //3. 검색된 Controller 를 이용해 해당업무를 처리한다.
      String viewName = controller.handleRequest(request,response);
      
      //4. ViewResolver 를 이용하여 view 경로와 이름을 조립
      String view = "";
      
      if(viewName.contains(".do")) {// URL 이므로 조립할 필요가없다.
         view = viewName;
      }else {
      view = viewResolver.getView(viewName);
      }
      //5. 사용자에게 응답
      response.sendRedirect(view);
   }

}

