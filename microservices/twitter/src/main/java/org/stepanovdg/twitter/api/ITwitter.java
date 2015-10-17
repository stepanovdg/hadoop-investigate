package org.stepanovdg.twitter.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Stepanov Dmitriy
 * Date: 16.10.2015
 * Time: 22:40
 */

@RestController
public interface ITwitter {

    @RequestMapping("/")
    String getDefault();

    @RequestMapping("/last/{user}")
    String getLastMessageForUser(@PathVariable("user") String user);

    @RequestMapping("/lastTime/{time}")
    String getLastMessageForTime(@PathVariable("time") Integer time);
}
