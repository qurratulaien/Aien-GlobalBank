package com.example.commentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.commentservice.model.Comments;
import com.example.commentservice.dao.CommentsDao;

@Service
public class CommentsServiceImpl implements CommentsService{

	@Autowired
	CommentsDao repo;
	
	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Comments> getCommentsByPid(Integer pid) {
		// TODO Auto-generated method stub
		return repo.findByPid(pid);
	}

	//@Override
	/*public Comments addComments(Comments comment) {
		// TODO Auto-generated method stub
		return repo.save(comment);
	}*/

}