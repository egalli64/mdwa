package s02;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@WebServlet("/s02/timerPlain")
public class TimerPlain extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(TimerPlain.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.trace("called");

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        try (PrintWriter writer = response.getWriter()) {
            writer.println(LocalTime.now());
        }
    }
}
