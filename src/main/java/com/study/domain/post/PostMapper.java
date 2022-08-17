package com.study.domain.post;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.common.dto.SearchDto;

@Mapper
public interface PostMapper {
	
	/*
	 * 게시글 저장
	 * @param parmas - 게시글 정보
	 */
	void save(PostRequest params);
	
	
	/*
	 * 게시글 상세정보 조회
	 * @param id - pk
	 * @return 게시글 상세정보
	 */
	PostResponse findById(Long id);
	
	
	/*
	 * 게시글 수정
	 * @param params - 게시글 정보 
	 */
	void update(PostRequest params);
	
	
	/* 테이블 생성하면서 delete_yn 컬럼  추가
	   실제로 데이터(레코드)를 삭제하지 않고, 컬럼의 상태 값을 1(true) 또는 0(false)로 지정해서
		삭제된 데이터인지, 삭제되지 않은 데이터인지 구분해주는 역할
	 * 게시글 삭제
	 * @param id - pk 
	 */
	void deleteById(Long id);
	
	
	/*
	 * 게시글 리스트 조회
	 * @param params - search conditions
	 * @return 게시글 리스트
	 */
	List<PostResponse> findAll(SearchDto params);
	
	
	/*
	 * 게시글 수 카운팅
	 * @param params - search condition
	 * @return 게시글 수
	 */
	int count(SearchDto params);
}

