package co.develhope.interceptor2.interceptor;

import co.develhope.interceptor2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import java.util.Arrays;
import java.util.List;

@Component
public class MonthInterceptor implements HandlerInterceptor {

    private static final List<Month> month = Arrays.asList(
            new Month(1, "January", "Gennaio", "Januar"),
            new Month(2, "February", "Febbraio", "Februar"),
            new Month(3, "March", "Marzo", "März"),
            new Month(4, "April", "Aprile", "April"),
            new Month(5, "May", "Maggio", "Mai"),
            new Month(6, "June", "Giugno", "Juni")
    );
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumberStr = request.getHeader("monthNumber");

        if (monthNumberStr == null || monthNumberStr.isEmpty()) {
            response.setStatus(400);
            return false;
        }
        else {
            for(int i =0; i<month.size(); i++) {
                if(month.get(i).getMonthNumber() == Integer.parseInt(monthNumberStr)) {
                    request.setAttribute("objectPresent", month.get(i));
                    response.setStatus(200);
                    return true;
                }
            }
            request.setAttribute("objectNope", new Month(0, "nope", "nope", "nope"));
        }
        response.setStatus(200);
        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }}
