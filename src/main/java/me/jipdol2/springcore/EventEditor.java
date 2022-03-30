package me.jipdol2.springcore;

import java.beans.PropertyEditorSupport;

/**
 * PropertyEditor 는 statsFull 하다. 즉, thread끼리 공유가 되므로 절대로 @Bean 으로 등록하면 안된다!!!!
 */
public class EventEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        return ((Event)getValue()).getTitle();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));
    }
}
