package uz.javohir.serialization;/* 
 @author: Javohir
  Date: 9/12/2021
  Time: 9:44 PM*/

import java.io.Serializable;

public class GameSave implements Serializable {
    public GameSave() {
        super();
    }

    private final long serialVersionUID=1L;

    private String config;
    private transient Integer id;
    private Integer mission;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMission() {
        return mission;
    }

    public void setMission(Integer mission) {
        this.mission = mission;
    }

    @Override
    public String toString() {
        return config+"-"+mission+"-"+"-"+id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
