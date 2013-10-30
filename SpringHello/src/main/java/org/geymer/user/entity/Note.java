package org.geymer.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notes")
public class Note {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "userId")
	Integer userId;
	@Column(name = "content")
	String content;

	public Note() {
	}

	public Note(Integer userId) {
		this.userId = userId;
	}

	public Note(Integer userId, String content) {

		this.userId = userId;
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", userId=" + userId + ", content=" + content
				+ "]";
	}

}
