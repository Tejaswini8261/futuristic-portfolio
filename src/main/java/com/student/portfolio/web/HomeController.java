package com.student.portfolio.web;

import com.student.portfolio.service.PortfolioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final PortfolioService portfolioService;

    public HomeController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("profile", portfolioService.getProfile());
        model.addAttribute("skills", portfolioService.getSkills());
        model.addAttribute("projects", portfolioService.getProjects());
        model.addAttribute("year", java.time.Year.now().getValue());
        return "index";
    }
}
