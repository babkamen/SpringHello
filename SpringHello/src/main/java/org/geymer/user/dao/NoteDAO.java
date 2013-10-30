package org.geymer.user.dao;

import java.util.List;

import org.geymer.user.entity.Note;

public interface NoteDAO {
	List<Note> getNotes(Integer userId);
	void addNote(Note note);
	Note getNote(Integer id);
	void editNote(Note note);
	void deleteNote(Integer id);


}
