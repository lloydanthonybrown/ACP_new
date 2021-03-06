import java.util.HashMap;

public class ApplicationController {
    private HashMap<String, ACHandler> handlerMap = new HashMap();

    public void handleRequest(String command, HashMap<String,Object> data){
        ACHandler aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handleIt(data);
        }
    }

    public void mapCommand(String aCommand, ACHandler acHandler){
        handlerMap.put(aCommand,acHandler);
    }
}
