package org.example.repository;

import org.example.Entity.President;

public interface PresidentRepository {
    void savePresident(President president);
    void deletePresident(Long id);
}
