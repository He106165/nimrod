package com.gioov.nimrod.system.controller;

import com.gioov.nimrod.common.Common;
import com.gioov.nimrod.system.System;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2018-02-22
 */
@Controller
@RequestMapping(System.Page.VIEW_PAGE_CATEGORY)
public class ViewPageCategoryController {

    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/add_dialog")
    public String addDialog() {
        return Common.trimSlash(System.Page.VIEW_PAGE_CATEGORY + "/add_dialog");
    }

    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/edit_dialog")
    public String editDialog() {
        return Common.trimSlash(System.Page.VIEW_PAGE_CATEGORY + "/edit_dialog");
    }

}
