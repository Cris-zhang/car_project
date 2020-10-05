package com.qcby.carsProject.mapper;

import com.qcby.carsProject.entity.TCar;
import com.qcby.carsProject.entity.TUser;
import org.apache.ibatis.annotations.Param;

import javax.xml.stream.events.Comment;
import java.util.List;
import java.util.Map;

public interface CommentDao {
    public List<Comment> list(Map<String, Object> map);
}
