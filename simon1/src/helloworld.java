import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1. 运行
 * a. 开发阶段可以直接在工具中运行
 *  a.1 如果外部已经启动，在工具中的tomcat启动不了（端口被占用）
 *  a.2 idea默认不带项目名 deployment里默认是斜杠 若要修改为带项目名 只用再后面加上项目名
 * b. 开发完成需要部署 tomcat webapps中
 *      自动部署
 *      手动部署
 * 2. 修改了类，必须重启服务器  jrebel修改的不用重启
 * 3. 修改了页面 不用重启服务器 要配置tomcat server
 */
public class helloworld extends HttpServlet {
    //ctrl + o 重写父类的方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!</h1>");
        out.println("<form>");
        out.println("<input type = 'radio' name = select value = Select> Select a beer<br>");
        out.println("<form>");
        out.println("now is:"+new SimpleDateFormat("YYYY-MM-dd E HH:mm:ss zzz").format(new Date()));
        out.println("</body>");
        out.println("</html>");
    }
}
