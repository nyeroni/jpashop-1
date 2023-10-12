package jpabook.jpashop.domain;

import jakarta.persistence.*;

@Entity
public class Album extends Item{

    @Id @GeneratedValue
    private Long id;
    private String artist;
    private String etc;
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }



}
