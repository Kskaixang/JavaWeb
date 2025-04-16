package g;

import java.io.IOException;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ks")
public class g extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Set<Integer> s = new HashSet<>();
		Random r = new Random();
		while(s.size()<5) {
			int num = r.nextInt(39) +1;
			s.add(num);			
		}
		resp.getWriter().print(s);
	}
	

}
