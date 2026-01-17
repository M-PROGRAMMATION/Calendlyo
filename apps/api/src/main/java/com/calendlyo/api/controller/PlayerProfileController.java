package com.calendlyo.api.controller;

import com.calendlyo.api.domain.PlayerProfile;
import com.calendlyo.api.service.PlayerProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/players")
public class PlayerProfileController {

    private final PlayerProfileService service;

    public PlayerProfileController(PlayerProfileService service) {
        this.service = service;
    }

    @GetMapping("/{playerId}")
    public ResponseEntity<PlayerProfile> getProfile(@PathVariable UUID playerId) {
        PlayerProfile profile = service.getOrCreateProfile(playerId);
        return ResponseEntity.ok(profile);
    }

    @PostMapping
    public ResponseEntity<PlayerProfile> createProfile(@RequestBody PlayerProfile profile) {
        PlayerProfile created = service.createProfile(profile);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }
}