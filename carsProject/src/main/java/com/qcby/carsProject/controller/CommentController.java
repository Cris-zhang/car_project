package com.qcby.carsProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/Comment")
public class CommentController extends BaseController {

    Map<String,Object> map =new HashMap<String,Object>();
		map.put("blogId",blog.getId());
		map.put("state",1);
		map.addObject("commentList",commentService.list(map));
}
