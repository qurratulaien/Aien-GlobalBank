package com.example.commentservice.service;

import java.util.List;


import com.example.commentservice.model.Comments;

public interface CommentsService {
	public List<Comments> getAllComments();
	public List<Comments> getCommentsByPid(Integer pid);
	//public Comments addComments(Comments comment);
}