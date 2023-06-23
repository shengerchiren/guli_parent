package com.liaoyu.service_edu.controller;

import com.liaoyu.service_base.entity.R;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/eduLogin")
public class EduLoginController {

    @PostMapping
    public R login(){
        return R.ok().data("token","123456789");
    }

    @GetMapping
    public R getInfo(){
        return R.ok().data("roles","[管理员]").data("name","张三").data("avatar","");
    }
}
