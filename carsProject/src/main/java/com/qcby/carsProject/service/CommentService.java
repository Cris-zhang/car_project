package com.qcby.carsProject.service;

import com.qcby.carsProject.entity.TCar;

import javax.xml.stream.events.Comment;
import java.util.List;
import java.util.Map;

public interface CommentService {
    public List<Comment> list(Map<String, Object> map);
}
