package org.teasir.json1.bean;

//import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    //@JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
