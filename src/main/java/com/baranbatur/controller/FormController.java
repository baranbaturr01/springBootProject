package com.baranbatur.controller;

import com.baranbatur.dto.TeacherDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
public class FormController {

    //http://localhost:8081/form
    //Form
    //getMethod
    @GetMapping("/form")
    public String getForm(Model model) {
        model.addAttribute("cv_teacher", new TeacherDto());
        return "form_post/formValidation";
    }

    @PostMapping("/form")
    public String addForm(@Valid @ModelAttribute("cv_teacher") TeacherDto teacherDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form_post/formValidation";
        }
        return "form_post/formValidation";
    }
}
