package com.calendlyo.api.service;

import com.calendlyo.api.domain.PlayerProfile;
import com.calendlyo.api.repository.PlayerProfileRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.UUID;

@Service
public class PlayerProfileService {

    private final PlayerProfileRepository repository;

    public PlayerProfileService(PlayerProfileRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public PlayerProfile createProfile(PlayerProfile profile) {
        if (profile.getSecretKey() == null || profile.getSecretKey().isEmpty()) {
            profile.setSecretKey(generateSecretKey());
        }
        if (profile.getJoinedAt() == null) {
            profile.setJoinedAt(new Timestamp(System.currentTimeMillis()));
        }
        return repository.save(profile);
    }

    @Transactional(readOnly = true)
    public Optional<PlayerProfile> getProfile(UUID playerId) {
        return repository.findById(playerId);
    }

    @Transactional
    public PlayerProfile getOrCreateProfile(UUID playerId) {
        return repository.findById(playerId)
                .orElseGet(() -> {
                    PlayerProfile newProfile = createDefaultProfile(playerId);
                    return repository.save(newProfile);
                });
    }

    private PlayerProfile createDefaultProfile(UUID playerId) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        PlayerProfile profile = new PlayerProfile();
        profile.setId(playerId);
        profile.setHosts(0);
        profile.setCrowns(0);
        profile.setCoins(0);
        profile.setRubis(0);
        profile.setLang("fr");
        profile.setSecretKey(generateSecretKey());
        profile.setJoinedAt(now);
        return profile;
    }

    private String generateSecretKey() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}

