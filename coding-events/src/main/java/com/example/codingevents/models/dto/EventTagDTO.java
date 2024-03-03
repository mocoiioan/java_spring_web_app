package com.example.codingevents.models.dto;

import com.example.codingevents.models.Event;
import com.example.codingevents.models.Tag;

public class EventTagDTO {

    private Event event;

    private Tag tag;

    public EventTagDTO() {
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
