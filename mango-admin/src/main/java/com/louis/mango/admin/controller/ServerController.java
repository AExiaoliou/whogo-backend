package com.louis.mango.admin.controller;

import com.louis.mango.core.http.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.louis.mango.admin.util.Server;


@RestController
@RequestMapping("/monitor/server")
public class ServerController
{
    @GetMapping()
    public HttpResult findUserRoles() throws Exception {
        Server server = new Server();
        server.copyTo();
        return HttpResult.ok(server);
    }


}
