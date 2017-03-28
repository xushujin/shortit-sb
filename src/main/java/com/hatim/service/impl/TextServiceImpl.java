package com.hatim.service.impl;

import com.hatim.domain.Text;
import com.hatim.domain.TextRepository;
import com.hatim.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Hatim on 2017/3/27.
 */
@Service
public class TextServiceImpl implements TextService {

    @Autowired
    TextRepository textRepository;

    @Override
    public String addText(String text) {
        Text t = new Text();
        t.setContent(text);
        t.setCreateDate(new Date());
        t = textRepository.save(t);
        return t.getId();
    }

    @Override
    public String readText(String id) {
        Text t = textRepository.findById(id);
        return t.getContent();
    }
}
