package berlinclock.controller;

import berlinclock.model.HourRequest;
import berlinclock.service.HourService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping
public class HourController {

    @Inject
    HourService hourService;

    @RequestMapping(value = "/any", method = RequestMethod.POST)
    public String[] convertTime(@RequestBody HourRequest hourRequest) {

        return hourService.timeToBerlinClock(hourRequest);

    }
    @RequestMapping(value = "/recent", method = RequestMethod.GET)
    public String[] recentTime() {

       return hourService.recentToBerlinClock();
    }

}
