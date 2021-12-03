package next.controller;

import next.controller.*;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class RequestMapping {
    private Map<String, Controller> mappings = new HashMap<>();

    void initMapping(){
        mappings.put("/", new HomeController());
        mappings.put("/users/form", new ForwardController("/user/form.jsp"));
        mappings.put("/users/loginFrom", new ForwardController("/user/login.jsp"));
        mappings.put("/users", new ListUserController());
        mappings.put("/users/profile", new ProfileController());
        mappings.put("/users/logout", new LogoutController());
        mappings.put("/users/create", new CreateUserController());
        mappings.put("/users/updateForm", new UpdateUserController());
        mappings.put("/users/update", new UpdateUserController());

    }

    public Controller findController(String url){
        return mappings.get(url);
    }

    void put(String url, Controller controller){
        mappings.put("url",controller);
    }
}
