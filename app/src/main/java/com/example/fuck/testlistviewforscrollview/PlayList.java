package com.example.fuck.testlistviewforscrollview;

public class PlayList {
    private String title;
    private String summary;
    private String imgUrl;
    private int num;

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public int getNum() {
        return num;
    }

    public PlayList(String title, String summary, String imgUrl,int num){
        this.title=title;
        this.summary=summary;
        this.imgUrl=imgUrl;
        this.num=num;
    }
}
