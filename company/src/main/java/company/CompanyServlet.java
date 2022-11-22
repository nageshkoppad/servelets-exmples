package company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns ={"/red","/show Details"})
public class CompanyServlet extends HttpServlet {

	ArrayList<CompanyDTO> list=new ArrayList<>();
	public CompanyServlet() {
		
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String companyName=req.getParameter("companyname");
	    String founder=req.getParameter("founder");
	    String since=req.getParameter("since");
	    String employeName=req.getParameter("employe");
	    String adress=req.getParameter("adress");
	    String business=req.getParameter("business");
	    
	    System.out.println(companyName);
	    System.out.println(founder);
	    System.out.println(since);
	    System.out.println(employeName);
	    System.out.println(adress);
	    System.out.println(business);
		
		resp.setContentType("text/html");
		PrintWriter  writer=resp.getWriter();
		
		writer.append("<html>")
		.append("<body>")
		.append(companyName)
		.append(founder)
		.append(since)
		.append(employeName)
		.append(adress)
		.append(business)
		.append("<body>")
		.append("<html>");
		
		CompanyDTO dto=new CompanyDTO(companyName,founder,since,employeName,adress,business);
		list.add(dto);
		System.out.println(list);
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		System.out.println("running the do get method");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("Details bandide")
		.append("</h1>")
		.append("<table>");
		for (CompanyDTO companyDTO : list) {
		writer.append("<tr>")
		.append("<td>")
		.append(companyDTO.getCompanyName())
		.append("</td>")
		.append("<td>")
		.append(companyDTO.getFounder())
		.append("</td>")
		.append("<td>")
		.append(companyDTO.getSince())
		.append("</td>")
		.append("<td>")
		.append(companyDTO.getEmploye())
		.append("</td>")
		.append("<td>")
		.append(companyDTO.getAdress())
		.append("</td>")
		.append("<td>")
		.append(companyDTO.getBusiness())
		.append("</td>")
		.append("</tr>");
		}
		writer.append("</table>")
		.append("</body>")
		.append("</html>");

	}
	
}
