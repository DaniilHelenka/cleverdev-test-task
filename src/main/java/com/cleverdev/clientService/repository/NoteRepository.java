package com.cleverdev.clientService.repository;

import com.cleverdev.clientService.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface NoteRepository extends JpaRepository<Note, Long> {
    Optional<Note> findByCreatedDateTime(LocalDateTime data);
}
