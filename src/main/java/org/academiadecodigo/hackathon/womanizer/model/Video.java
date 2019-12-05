package org.academiadecodigo.hackathon.womanizer.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "video")
public class Video extends Model {

    private String title;
    private String youtubeId;
    private String thumbnail;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", youtubeId='" + youtubeId + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}
