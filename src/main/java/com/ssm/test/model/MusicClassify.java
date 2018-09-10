package com.ssm.test.model;

public class MusicClassify {
    private Integer id;

    private String classifyname;

    public MusicClassify(Integer id, String classifyname) {
        this.id = id;
        this.classifyname = classifyname;
    }

    public MusicClassify() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassifyname() {
        return classifyname;
    }

    public void setClassifyname(String classifyname) {
        this.classifyname = classifyname == null ? null : classifyname.trim();
    }
}