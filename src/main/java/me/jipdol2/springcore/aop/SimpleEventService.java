package me.jipdol2.springcore.aop;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService{

    @Override
    public void createEvent() {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Create an event");

    }

    @Override
    public void publishEvent() {
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Publish an event");
    }

    public void deleteEvent(){
        System.out.println("Delete an event");
    }
}
