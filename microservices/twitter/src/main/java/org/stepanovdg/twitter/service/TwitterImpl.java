package org.stepanovdg.twitter.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.stepanovdg.twitter.api.ITwitter;

/**
 * User: Stepanov Dmitriy
 * Date: 16.10.2015
 * Time: 22:35
 */

@Component
public class TwitterImpl implements ITwitter {

    public String getDefault() {
        return "hello";
    }

    public String getLastMessageForUser(@PathVariable("user") String user) {
        System.out.println("user="+user);
        return "new message of the "+ user;
    }

    @Override
    public String getLastMessageForTime(@PathVariable("time") Integer time) {
        return time.toString()+ "time was int provide";
    }
}

