package com.lintori.rebyu.Entities;

public class Tag {

    private Long id;
    private String nametag;

    public Tag(Long id, String nametag) {
        this.id = id;
        this.nametag = nametag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNametag() {
        return nametag;
    }

    public void setNametag(String nametag) {
        this.nametag = nametag;
    }

    
    
}
