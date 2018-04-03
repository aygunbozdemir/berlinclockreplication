package berlinclock.controller;

import berlinclock.model.HourRequest;
import berlinclock.model.VisualBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping
public class HourController {

    //@Inject
    //HourService hourService;

    @Inject
    VisualBuilder visualBuilder;



    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String[] convertTime(@RequestBody HourRequest hourRequest) {

        return visualBuilder.berlinClock(hourRequest);


    }

}
