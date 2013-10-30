package org.geymer.user.service;

import java.util.List;

import org.geymer.user.dao.NoteDAOImpl;
import org.geymer.user.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class NoteManagerImpl implements NoteManager {
	@Autowired
	NoteDAOImpl noteDAO;

	@Override
	public List<Note> getNotes(Integer userId) {	
		return noteDAO.getNotes(userId);
	}

	@Override
	public void addNote(Note note) {
		 noteDAO.addNote(note);
	}

	@Override
	public Note getNote(Integer id) {
		return noteDAO.getNote(id);
	}

	@Override
	public void editNote(Note note) {
		noteDAO.editNote(note);
	}

	@Override
	public void deleteNote(Integer id) {
		noteDAO.deleteNote(id);
	}



}
