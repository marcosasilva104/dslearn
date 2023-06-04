package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content  extends Lesson {

	private static final long serialVersionUID = 1L;

	private String lessonContent;
	private String videoUri;
	
	public Content() {
	}

	public Content(Long id, String title, Integer position, Section section, String lessonContent, String videoUri) {
		super(id, title, position, section);
		this.lessonContent = lessonContent;
		this.videoUri = videoUri;
	}

	public String getLessonContent() {
		return lessonContent;
	}

	public void setLessonContent(String lessonContent) {
		this.lessonContent = lessonContent;
	}

	public String getVideoUri() {
		return videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}
}

