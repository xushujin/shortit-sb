package com.hatim.web;

import com.hatim.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Hatim on 2017/3/27.
 */
@Controller
public class IndexController {

    @Autowired
    TextService textService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    private String index(ModelMap map) {
        map.addAttribute("host", "短点");
        return "index";
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    private String read(@PathVariable(value = "id") String id, ModelMap map) {
        map.addAttribute("text_content", textService.readText(id));
        return "txt";
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    private String read2(ModelMap map) {
        map.addAttribute("text_content", textService.readText("58d9bf59dbd0c52c7cf43357"));
        return "txt";
    }

}
