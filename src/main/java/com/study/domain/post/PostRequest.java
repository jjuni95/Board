package com.study.domain.post;
//게시글을 작성할  때 입력받아야 할 필드

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PostRequest {
	private Long id;			//pk
	private String title;		//제목
	private String content;		//내용
	private String writer;		//작성자
	private Boolean noticeYn;	//공지글 여부
}
