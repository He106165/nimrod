package com.gioov.nimrod.flowable.controller;

import com.gioov.nimrod.flowable.Flowable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2019-01-21
 */
@RequestMapping(Flowable.Page.ACT_RE_PROCDEF)
@Controller
public class ActReProcdefController {

    @GetMapping("/page_all")
    public String pageAll() {
        return com.gioov.nimrod.common.Common.trimSlash(Flowable.Page.ACT_RE_PROCDEF + "/page_all");
    }

}
