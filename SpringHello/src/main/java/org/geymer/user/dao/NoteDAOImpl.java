package org.geymer.user.dao;

import java.util.List;

import org.geymer.user.entity.Note;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

public class NoteDAOImpl implements NoteDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Note> getNotes(Integer userId) {
		return sessionFactory.getCurrentSession().createCriteria(Note.class)
				.add(Restrictions.eq("userId", userId)).list();
	}

	@Override
	public void addNote(Note note) {
		sessionFactory.getCurrentSession().save(note);
	}

	@Override
	public Note getNote(Integer id) {
		return (Note) sessionFactory.getCurrentSession().get(Note.class, id);
	}

	@Override
	public void editNote(Note note) {
		sessionFactory.getCurrentSession().update(note);
	}

	@Override
	public void deleteNote(Integer id) {
		Note note=this.getNote(id);
		if(note!=null)sessionFactory.getCurrentSession().delete(note);
	}

}
