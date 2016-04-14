import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * Created by tmp on 14.04.2016.
 */
public class MyServer {
    public static void main(String[]args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();
        server.setHandler(handler);
        handler.addServlet(TestServer.class, "/");
        server.start();
    }
}
