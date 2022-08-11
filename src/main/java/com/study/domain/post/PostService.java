package com.study.domain.post;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
	
	private final PostMapper postMapper;
	
	/*
	 * 게시글 저장
	 * @param params - 게시글 정보
	 * @return Generated pk
	 */
	@Transactional
	public Long savePost(final PostRequest params) {
		postMapper.save(params);
		return params.getId();
	}
	
	/*
	 * 게시글 상세정보 조회
	 * @param id - pk
	 * @return 게시글 상세정보
	 */
	public PostResponse findPostById(final Long id) {
		return postMapper.findById(id);
	}
	
	/*
	 * 게시글 수정
	 * @param params - 게시글 정보
	 * @return pk
	 */
	@Transactional
	public Long updatePost(final PostRequest params) {
		postMapper.update(params);
		return params.getId();
	}
	
	/*
	 * 게시글 삭제
	 * @param id - pk
	 * @return pk
	 */
	public Long deletePost(final Long id) {
		postMapper.deleteById(id);
		return id;
	}
	
	/*
	 * 게시글 리스트 조회
	 * @return 게시글 리스트
	 */
	public List<PostResponse> findAllPost(){
		return postMapper.findAll();
	}

}
