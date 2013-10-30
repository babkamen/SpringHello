package org.geymer.user.controller;

import java.util.Locale;

import org.geymer.user.entity.Note;
import org.geymer.user.service.NoteManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/notes/{userId}")
public class NoteController {
	@Autowired
	NoteManager noteManager;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String notes(@PathVariable("userId") Integer userId, Locale locale,
			Model model) {
		model.addAttribute("noteList", noteManager.getNotes(userId));
		model.addAttribute("note", new Note(userId));
		return "notes";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addNote(@PathVariable("userId") Integer userId,
			@ModelAttribute("note") Note note) {
		System.out.println(note);
		note.setUserId(userId);
		//note.setContent(content);
		noteManager.addNote(note);
		return "redirect:/notes/"+userId+"/";
	}

	@RequestMapping(value = "/delete/{noteId}")
	public String delete(@PathVariable("userId") Integer userId,@PathVariable("noteId") Integer noteId) {
		noteManager.deleteNote(noteId);
		return "redirect:/notes/"+userId+"/";
	}

	@RequestMapping(value = "/edit/{noteId}", method = RequestMethod.GET)
	public String edit(@PathVariable("userId") Integer userId,@PathVariable("noteId") Integer noteId, Model model) {
		model.addAttribute("note", noteManager.getNote(noteId));
		return "editNote";
	}

	@RequestMapping(value = "/edit/{noteId}", method = RequestMethod.POST)
	public String processEdit(@PathVariable("userId") Integer userId,@PathVariable("noteId") Integer noteId,
			@ModelAttribute("note") Note note) {
		System.out.println(note);
		note.setUserId(userId);
		noteManager.editNote(note);
		return "redirect:/notes/"+userId+"/";
	}

}
