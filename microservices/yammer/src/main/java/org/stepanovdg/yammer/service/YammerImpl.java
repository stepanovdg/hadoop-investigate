package org.stepanovdg.yammer.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.stepanovdg.yammer.api.IYammer;

/**
 * User: Stepanov Dmitriy
 * Date: 16.10.2015
 * Time: 22:35
 */

@Component
public class YammerImpl implements IYammer {

    public String getDefault() {
        return "hello";
    }

    public String getLastMessageForUser(@PathVariable String user) {
        return "new message =" + user;
    }
}

