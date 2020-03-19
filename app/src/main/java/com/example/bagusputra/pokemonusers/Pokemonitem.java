package com.example.bagusputra.pokemonusers;

import android.util.Log;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pokemonitem {


    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("avatar_url")
    @Expose
    private String avatar_url;
    @SerializedName("html_url")
    @Expose
    private String html_url;


    public Pokemonitem(String login, String avatarUrl, String htmlUrl){
        this.login = login;
        this.avatar_url = avatarUrl;
        this.html_url = htmlUrl;
    }


    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getAvatarUrl(){
        return avatar_url;
    }

    public void setAvatarUrl(String avatarUrl){
        this.avatar_url = avatarUrl;
    }

    public String getHtmlUrl(){
        return html_url;
    }

    public void setHtmlUrl(String htmlUrl){
        this.html_url = htmlUrl;
    }



}
