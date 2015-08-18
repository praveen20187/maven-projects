import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class LoginController implements Controller{
	
	verifyservice vs;
	
	public void setVs(verifyservice vs){
		this.vs=vs;
		
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		String un=req.getParameter("t1");
		String pw=req.getParameter("t2");
		
		int k=vs.verifydata(un,pw);
		
		if(k==1)
			return new ModelAndView("success.jsp");
		else
			return new ModelAndView("failure.jsp");
		
	}
}
