package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Id;

import kong.unirest.HttpResponse;

public class ServerController() {

    private String rootURL = "http://zipcode.rocks:8085";

    private static ServerController svr = new ServerController();

    private ServerController() {
    }

    public static ServerController getInstance() {
        return svr;
    }

    public String idGet(String s) {
        HttpResonse<JsonNode> response = Unirest.get("http://localhost/8000")
                .header("accept", "application/json")
                .queryString("apiKey", "123")
                .field("parameter", "value")
                .field("firstname", "Gary")
                .asJson();
        return null;
    }

    public JsonString idPost(Id id) {
        // url -> /ids/
        // create json from Id
        // request
        // reply
        // return json
        return null;
    }

    public JsonString idPut(Id id) {
        // url -> /ids/
        return null;
    }
}


// ServerController.shared.doGet()