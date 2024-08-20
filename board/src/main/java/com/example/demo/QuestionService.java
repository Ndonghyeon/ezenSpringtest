package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class QuestionService {

	private final QuestionResponsitory qr;
	
	public List<Question>getList(){
		return this.qr.findAll();
	}

	public Question getQuestion(Integer id) throws PpakchimException {     
		Optional<Question> q1 = this.qr.findById(id);
		return q1.get();
	}

	public void create(String subject, String content) {     //this.qr.create(subject, content);
															
		// TODO Auto-generated method stub
		Question q = new Question();
		q.setSubject(subject);
		q.setContent(content);
		q.setCreateDate(LocalDateTime.now());
		this.qr.save(q);
		}
	
	
	
	}

