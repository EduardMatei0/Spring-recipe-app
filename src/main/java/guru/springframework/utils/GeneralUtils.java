package guru.springframework.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
@Slf4j
public class GeneralUtils {


    public static ModelAndView genericExceptionMethod(Exception e, String viewName) {
        log.error("Handling not found exception");
        log.error(e.getMessage());

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName(viewName);
        modelAndView.addObject("exception", e);

        return modelAndView;
    }
}
