package com.example.commentservice.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.commentservice.model.Comments;

public interface CommentsDao extends JpaRepository<Comments,Integer>{
	public List<Comments> findByPid(Integer pid);
}