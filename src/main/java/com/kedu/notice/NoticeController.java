package com.kedu.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 		공지사항 관련 기능 controller
 * */

@RequestMapping("")
@RestController
public class NoticeController {
	@Autowired
	private NoticeService NoticeService;
	// 알아 고쳐쓸려면 알아서 고쳐쓰소
}