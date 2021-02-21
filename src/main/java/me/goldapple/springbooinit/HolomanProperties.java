package me.goldapple.springbooinit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties("holoman")
public class HolomanProperties{
    private String name;
    private int howlong;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHowlong(){
        return howlong;
    }

    public void setHowlong(int howlong){
        this.howlong = howlong;
    }
}
