package com.liaoyu.service_edu.controller;

import com.liaoyu.service_edu.entity.EduTeacher;
import com.liaoyu.service_edu.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author liaoyu
 * @since 2023-06-14
 */
@RestController
@RequestMapping("/serviceEdu/eduTeacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;

    @Cacheable(value = "teacher",key = "'cache'")
    @GetMapping("findAllTea")
    public List<EduTeacher> findAllTea(){
        return eduTeacherService.list(null);
    }
}
