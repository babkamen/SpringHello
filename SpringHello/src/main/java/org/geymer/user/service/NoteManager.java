package org.geymer.user.service;

import java.util.List;

import org.geymer.user.entity.Note;

public interface NoteManager {
List<Note> getNotes(Integer userId);
void addNote(Note note);
Note getNote(Integer id);
void editNote(Note note);
void deleteNote(Integer id);


}
