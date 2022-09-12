package com.example.toptrumps.toptrumps.models;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;

@Entity
@Table(name = "cards")
public class Card implements Serializable {
    @Column(name = "name")
    private String name;
    @Column(name = "attack")
    private Integer attack;
    @Column(name = "control")
    private Integer control;
    @Column(name = "defend")
    private Integer defend;
    @Column(name = "initiate")
    private Integer initiate;
    @Column(name = "damage")
    private Integer damage;
    @Column(name = "picture")
    private String picture;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Card(){

    }

    public Card(String name, Integer attack, Integer control, Integer defend, Integer initiate, Integer damage, String picture) {
        this.name = name;
        this.attack = attack;
        this.control = control;
        this.defend = defend;
        this.initiate = initiate;
        this.damage = damage;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getControl() {
        return control;
    }

    public void setControl(Integer control) {
        this.control = control;
    }

    public Integer getDefend() {
        return defend;
    }

    public void setDefend(Integer defend) {
        this.defend = defend;
    }

    public Integer getInitiate() {
        return initiate;
    }

    public void setInitiate(Integer initiate) {
        this.initiate = initiate;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
