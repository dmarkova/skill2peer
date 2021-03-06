package org.az.skill2peer.nuclei.common.controller.rest.dto;

import java.util.ArrayList;
import java.util.List;

public class CourseInfoDto {

    private UserInfoDto author;

    private LocationDto location;

    private PriceDto price;

    private String description;

    private String skills;

    private Integer id;

    private ScheduleDto schedule;

    private String name;

    private String summary;

    private List<LessonInfoDto> lessons = new ArrayList<LessonInfoDto>();

    public UserInfoDto getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public Integer getId() {
        return id;
    }

    public List<LessonInfoDto> getLessons() {
        return lessons;
    }

    public LocationDto getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public PriceDto getPrice() {
        return price;
    }

    public ScheduleDto getSchedule() {
        return schedule;
    }

    public String getSkills() {
        return skills;
    }

    public String getSummary() {
        return summary;
    }

    public boolean isSingleLesson() {
        return this.lessons.size() == 1;
    }

    public void setAuthor(final UserInfoDto author) {
        this.author = author;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public void setLessons(final List<LessonInfoDto> lessons) {
        this.lessons = lessons;
    }

    public void setLocation(final LocationDto location) {
        this.location = location;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPrice(final PriceDto price) {
        this.price = price;
    }

    public void setSchedule(final ScheduleDto schedule) {
        this.schedule = schedule;
    }

    //    private SortedSet<User> lectors;
    //
    //    private List<Lesson> lessons = new ArrayList<Lesson>();

    public void setSkills(final String skills) {
        this.skills = skills;
    }

    public void setSummary(final String summary) {
        this.summary = summary;
    }
}
