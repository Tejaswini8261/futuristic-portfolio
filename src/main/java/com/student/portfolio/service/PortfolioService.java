package com.student.portfolio.service;

import com.student.portfolio.model.Profile;
import com.student.portfolio.model.Project;
import com.student.portfolio.model.SkillCategory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    public Profile getProfile() {
        return new Profile(
                "Tejaswini Bharati",
                "BCA 2nd Year • Aspiring Software Developer",
                "Passionate about building sleek UIs and scalable backends. Exploring Spring Boot, React, and cloud-native tools.",
                "Tejaswinibharati17@gmail.com",
                "8261013204",
                "Taloda, India",
                "https://github.com/Tejaswini8261",
                "https://linkedin.com/in/your-linkedin",
                "https://your-cdn.com/resume.pdf"
        );
    }

    public List<SkillCategory> getSkills() {
        return List.of(
                new SkillCategory("Languages", List.of("Java", "JavaScript", "TypeScript", "SQL")),
                new SkillCategory("Frameworks", List.of("Spring Boot", "React", "Node.js", "Express")),
                new SkillCategory("Databases", List.of("MySQL", "PostgreSQL", "MongoDB")),
                new SkillCategory("Tools", List.of("Git", "Docker", "Postman", "Figma"))
        );
    }

    public List<Project> getProjects() {
        return List.of(
                new Project(
                        "Campus Connect",
                        "A portal for students to share notes, events, and opportunities with real-time updates.",
                        List.of("Spring Boot", "Thymeleaf", "PostgreSQL", "WebSocket"),
                        "https://github.com/your-github/campus-connect",
                        "https://your-demo-link.com/campus-connect",
                        "https://images.unsplash.com/photo-1527443154391-507e9dc6c5cc?q=80&w=1200&auto=format&fit=crop"
                ),
                new Project(
                        "Expense Tracker",
                        "Personal finance tracker with charts and budgets.",
                        List.of("React", "Node.js", "MongoDB", "Chart.js"),
                        "https://github.com/your-github/expense-tracker",
                        "https://your-demo-link.com/expense-tracker",
                        "https://images.unsplash.com/photo-1554224155-8d04cb21cd6c?q=80&w=1200&auto=format&fit=crop"
                ),
                new Project(
                        "AI Resume Scanner",
                        "Parses resumes and scores them against job descriptions.",
                        List.of("Python", "FastAPI", "NLP"),
                        "https://github.com/your-github/ai-resume-scanner",
                        "https://your-demo-link.com/ai-resume-scanner",
                        "https://images.unsplash.com/photo-1531297484001-80022131f5a1?q=80&w=1200&auto=format&fit=crop"
                )
        );
    }
}
