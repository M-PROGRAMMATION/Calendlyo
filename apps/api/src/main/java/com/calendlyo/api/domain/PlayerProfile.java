package com.calendlyo.api.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "player_profiles")
public class PlayerProfile {

    @Id
    @Column(columnDefinition = "UUID")
    private UUID id;

    @Column(nullable = false)
    private int hosts = 0;

    @Column(nullable = false)
    private int crowns = 0;

    @Column(nullable = false)
    private int coins = 0;

    @Column(nullable = false)
    private int rubis = 0;

    @Column(nullable = false, length = 10)
    private String lang = "fr";

    @Column(name = "last_server")
    private String lastServer;

    @Column(name = "secret_key", nullable = false, unique = true)
    private String secretKey;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;

    @Column(name = "joined_at", nullable = false)
    private Timestamp joinedAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt;

    public PlayerProfile() {
    }

    public PlayerProfile(UUID id, int hosts, int crowns, int coins, int rubis,
                         String lang, String lastServer, String secretKey,
                         Timestamp createdAt, Timestamp joinedAt, Timestamp updatedAt) {
        this.id = id;
        this.hosts = hosts;
        this.crowns = crowns;
        this.coins = coins;
        this.rubis = rubis;
        this.lang = lang;
        this.lastServer = lastServer;
        this.secretKey = secretKey;
        this.createdAt = createdAt;
        this.joinedAt = joinedAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getHosts() {
        return hosts;
    }

    public void setHosts(int hosts) {
        this.hosts = hosts;
    }

    public int getCrowns() {
        return crowns;
    }

    public void setCrowns(int crowns) {
        this.crowns = crowns;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getRubis() {
        return rubis;
    }

    public void setRubis(int rubis) {
        this.rubis = rubis;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLastServer() {
        return lastServer;
    }

    public void setLastServer(String lastServer) {
        this.lastServer = lastServer;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Timestamp joinedAt) {
        this.joinedAt = joinedAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}

