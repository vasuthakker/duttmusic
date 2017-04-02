package com.example.android.uamp.model;

/**
 * Created by vasu on 4/1/2017.
 */

public class SongEntity {

    private String title;
    private String album;
    private String artist;
    private String source;
    private String image;
    private int trackNumber;
    private int trackCount;
    private long duration;
    private long compilationType;

    public SongEntity(String title, String album, String artist, String source, String image, int trackNumber, int trackCount, long duration, long compilationType) {
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.source = source;
        this.image = image;
        this.trackNumber = trackNumber;
        this.trackCount = trackCount;
        this.duration = duration;
        this.compilationType = compilationType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getCompilationType() {
        return compilationType;
    }

    public void setCompilationType(long compilationType) {
        this.compilationType = compilationType;
    }
}
