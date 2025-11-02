package com.student.portfolio.model;

public class Profile {
    private String name;
    private String tagline;
    private String bio;
    private String email;
    private String phone;
    private String location;
    private String github;
    private String linkedin;
    private String resumeUrl;

    public Profile() {}

    public Profile(String name, String tagline, String bio, String email, String phone, String location, String github, String linkedin, String resumeUrl) {
        this.name = name;
        this.tagline = tagline;
        this.bio = bio;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.github = github;
        this.linkedin = linkedin;
        this.resumeUrl = resumeUrl;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTagline() { return tagline; }
    public void setTagline(String tagline) { this.tagline = tagline; }

    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getGithub() { return github; }
    public void setGithub(String github) { this.github = github; }

    public String getLinkedin() { return linkedin; }
    public void setLinkedin(String linkedin) { this.linkedin = linkedin; }

    public String getResumeUrl() { return resumeUrl; }
    public void setResumeUrl(String resumeUrl) { this.resumeUrl = resumeUrl; }
}
