package com.ssm.test.model;

public class Music {
    private Integer id;

    private String musicname;

    private String coverurl;

    private String resourceurl;

    private Integer classify;

    private Integer heat;

    private Integer clickupnum;

    public Music(Integer id, String musicname, String coverurl, String resourceurl, Integer classify, Integer heat, Integer clickupnum) {
        this.id = id;
        this.musicname = musicname;
        this.coverurl = coverurl;
        this.resourceurl = resourceurl;
        this.classify = classify;
        this.heat = heat;
        this.clickupnum = clickupnum;
    }

    public Music() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMusicname() {
        return musicname;
    }

    public void setMusicname(String musicname) {
        this.musicname = musicname == null ? null : musicname.trim();
    }

    public String getCoverurl() {
        return coverurl;
    }

    public void setCoverurl(String coverurl) {
        this.coverurl = coverurl == null ? null : coverurl.trim();
    }

    public String getResourceurl() {
        return resourceurl;
    }

    public void setResourceurl(String resourceurl) {
        this.resourceurl = resourceurl == null ? null : resourceurl.trim();
    }

    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    public Integer getHeat() {
        return heat;
    }

    public void setHeat(Integer heat) {
        this.heat = heat;
    }

    public Integer getClickupnum() {
        return clickupnum;
    }

    public void setClickupnum(Integer clickupnum) {
        this.clickupnum = clickupnum;
    }
}