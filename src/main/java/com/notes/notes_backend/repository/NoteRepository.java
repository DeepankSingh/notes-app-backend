package com.notes.notes_backend.repository;

import com.notes.notes_backend.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
