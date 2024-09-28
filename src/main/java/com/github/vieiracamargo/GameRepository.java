package com.github.vieiracamargo;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.Optional;

@ApplicationScoped
public class GameRepository implements PanacheRepositoryBase<Preset, Long> {

    @Transactional
    public Optional<Preset> findByTitleOptional(String title) {
        return find("title", title).firstResultOptional();
    }
}
