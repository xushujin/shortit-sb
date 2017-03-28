package com.hatim.web;

import com.hatim.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Hatim on 2017/3/27.
 */
@RestController
@RequestMapping(value = "/text")
public class TextController {

    @Autowired
    TextService textService;

    @Autowired
    HttpServletRequest request;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private String addText(String text) {
        String id = textService.addText(text);
        return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                + request.getContextPath() + "/id/" + id;
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    private String readText(String id) {
        return textService.readText(id);
    }
}
