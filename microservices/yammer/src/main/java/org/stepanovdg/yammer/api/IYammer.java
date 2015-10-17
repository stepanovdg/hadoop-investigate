package org.stepanovdg.yammer.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Stepanov Dmitriy
 * Date: 16.10.2015
 * Time: 22:40
 */

@RestController
public interface IYammer {

    @RequestMapping("/")
    String getDefault();

    @RequestMapping("/last/{user}")
    String getLastMessageForUser(@PathVariable String user);
}
