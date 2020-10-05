package com.qcby.carsProject.service.impl;

import com.qcby.carsProject.mapper.CommentDao;
import com.qcby.carsProject.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.stream.events.Comment;
import java.util.List;
import java.util.Map;
@Service("CommentService")
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentDao commentDao;
    public List<Comment> list(Map<String, Object> map) {

        return commentDao.list(map);
    }
}
