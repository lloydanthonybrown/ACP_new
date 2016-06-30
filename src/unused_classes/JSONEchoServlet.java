package unused_classes;

import org.quickconnectfamily.json.*;
import org.quickconnectfamily.json.WebServlet;
import java.io.IOException;
import java.util.HashMap;


@WebServlet(name = "JSONEchoService", urlPatterns = {"/json"})
public class JSONEchoServlet extends HttpServlet {
    private ApplicationController theAppController = new ApplicationController();

    public void init(){
        theAppController.mapCommand("Speak", new SpeakHandler());
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            JSONInputStream inFromClient = new JSONInputStream(request.getInputStream());
            JSONOutputStream outToClient = new JSONOutputStream(response.getOutputStream());

            HashMap<String, Object> dataMap = (HashMap) inFromClient.readObject();
            dataMap.put("toClient", outToClient);

            String aCommand = (String) dataMap.get("command");
            theAppController.handleRequest(aCommand, dataMap);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}