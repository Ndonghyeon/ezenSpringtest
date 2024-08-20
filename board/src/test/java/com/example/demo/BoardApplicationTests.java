package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class BoardApplicationTests {

	@Autowired
	private QuestionResponsitory qRepo;
	
	@Test
	void contextLoads() {
		
		Question q1 = new Question();
		q1.setSubject("군침도는 메뉴 추천해주세요");
		q1.setContent("저는 오이 알레르기가 있어요. " + "근데 오이향은 좋아해요");
		
		q1.setCreateDate(LocalDateTime.now());
		this.qRepo.save(q1);
//		
//		Question q2 = new Question();
//		q2.setSubject("감기 조심하세요 ");
//		q2.setContent("요즘 독감이 유행하고 있습니다.");
//		
//		q2.setCreateDate(LocalDateTime.now());
//		this.qRepo.save(q2);
		
//		
//		// findAll : 데이터 전체조회 (해당 리파지토리에있는) 
//		List<Question>sel = this.qRepo.findAll();
//		
//		System.out.println(sel.toString());
//		
//		Question q = sel.get(1);
//		
//		System.out.println(q.getSubject());
//		System.out.println(q.getContent());
		
		//데이터를 가늠잡고 싶을때 주로 사용 
//		assertEquals(8, sel.size());
		
		
		
		// 데이터 수정 
		//findById
//		Optional<Question>oq = this.qRepo.findById(1);
//		Question q2  = oq.get();
//		q2.setSubject("저녁 뭐 먹을까?...");
//		this.qRepo.save(q2);
		
		
		// 데이터 삭제 
//		Optional<Question>oq = this.qRepo.findById(1);
//		Question q2  = oq.get();
//		q2.setSubject("저녁 뭐 먹을까?...");
//		this.qRepo.delete(q2);    // 삭제는 save대신 delete 
//		
//		List<Question> sel2 = this.qRepo.findAll();
//		
//		System.out.println(sel2.toString());
		
	
	}

}
