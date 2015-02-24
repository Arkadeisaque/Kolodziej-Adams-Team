/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Arkadiusz
 */
public class Food implements Serializable{
    
    // class instance variables
    private String type;
    private Integer healthBonus;
    private String name;
    private Integer strenghtBonus;

    public Food() {
    }
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getHealthBonus() {
        return healthBonus;
    }

    public void setHealthBonus(Integer healthBonus) {
        this.healthBonus = healthBonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStrenghtBonus() {
        return strenghtBonus;
    }

    public void setStrenghtBonus(Integer strenghtBonus) {
        this.strenghtBonus = strenghtBonus;
    }

    @Override
    public String toString() {
        return "Food{" + "type=" + type + ", healthBonus=" + healthBonus + ", name=" + name + ", strenghtBonus=" + strenghtBonus + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.type);
        hash = 47 * hash + Objects.hashCode(this.healthBonus);
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.strenghtBonus);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Food other = (Food) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.healthBonus, other.healthBonus)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.strenghtBonus, other.strenghtBonus)) {
            return false;
        }
        return true;
    }
    
    
}
