package ru.den_ostap.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.den_ostap.learning.entity.Source;
@Repository

public interface SourceRepository extends JpaRepository<Source, Long> {
}