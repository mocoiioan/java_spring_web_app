package com.example.codingevents.controllers;

import com.example.codingevents.models.EventCategory;
import com.example.codingevents.service.EventCategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("events/categories")
public class EventCategoryController {

    @Autowired
    private EventCategoryService eventCategoryService;

    @GetMapping
    public String displayAllEventCategories(Model model){
        model.addAttribute("title", "All Event Categories");
        model.addAttribute("eventCategories", eventCategoryService.findAll());
        return "eventCategories/index";
    }

    @GetMapping("create")
    public String displayCreateEventCategoryForm(Model model){
        model.addAttribute("title", "Create event category");
        model.addAttribute(new EventCategory());
        return "eventCategories/create";
    }

    @PostMapping("create")
    public String createEventCategory(@ModelAttribute @Valid EventCategory newEventCategory, Errors errors, Model model){

        if(errors.hasErrors()){
            model.addAttribute("title", "Create event category");
            return "eventCategories/create";
        }

        eventCategoryService.save(newEventCategory);
        return "redirect:/events/categories";
    }
}
