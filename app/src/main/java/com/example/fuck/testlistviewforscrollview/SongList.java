package com.example.fuck.testlistviewforscrollview;

public class SongList  {
    private String title;
    private String summary;
    private String imgUrl;

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public SongList(String title, String summary, String imgUrl){
        this.title=title;
        this.summary=summary;
        this.imgUrl=imgUrl;
    }
}
