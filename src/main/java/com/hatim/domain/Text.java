package com.hatim.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Hatim on 2017/3/27.
 */
@Document(collection = "t_text")
public class Text implements Serializable {
    private static final long serialVersionUID = -1L;

    @Id
    private String id;
    private String content;
    private Date createDate;

    @Override
    public String toString() {
        return "Text{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
