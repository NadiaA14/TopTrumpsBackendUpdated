package com.example.toptrumps.toptrumps.models;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;

@Entity
@Table(name = "cards")
public class Card implements Serializable {
    @Column(name = "name")
    private String name;
    @Column(name = "attacker")
    private Integer attack;
    @Column(name = "controller")
    private Integer controller;
    @Column(name = "defender")
    private Integer defender;
    @Column(name = "initiator")
    private Integer initiator;
    @Column(name = "damage")
    private Integer damage;
    @Column(name = "picture")
    private String picture;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Card(){

    }

    public Card(String name, Integer attack, Integer controller, Integer defender, Integer initiator, Integer damage, String picture) {
        this.name = name;
        this.attack = attack;
        this.controller = controller;
        this.defender = defender;
        this.initiator = initiator;
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

    public Integer getController() {
        return controller;
    }

    public void setController(Integer controller) {
        this.controller = controller;
    }

    public Integer getDefender() {
        return defender;
    }

    public void setDefender(Integer defender) {
        this.defender = defender;
    }

    public Integer getInitiator() {
        return initiator;
    }

    public void setInitiator(Integer initiator) {
        this.initiator = initiator;
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
