package com.hatim.service;

import org.springframework.stereotype.Service;

/**
 * Created by Hatim on 2017/3/27.
 */
@Service
public interface TextService {

    /**
     * 添加
     *
     * @param text
     * @return
     */
    String addText(String text);

    /**
     * 读取
     *
     * @param id
     * @return
     */
    String readText(String id);
}
