package com.slor8.secondcustomtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class WelcomeMessage extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        JspWriter out = getJspContext().getOut();

        LocalTime noonMessage = LocalTime.of(12, 00, 00);
        LocalDate sunMessage = LocalDate.of(2018, 2, 4);
        LocalDate monMessage = LocalDate.of(2018, 2, 5);
        LocalDate checkPoint1 = LocalDate.of(2018, 2, 6);
        LocalDate wedMessage = LocalDate.of(2018, 2, 7);
        LocalDate thuMessage = LocalDate.of(2018, 2, 8);

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();

        if (time.isBefore(noonMessage)) {
            out.println("GOOD-MORNING....!");
        } else if (date.isEqual(sunMessage)) {
            out.println("!++++ 2-DAY IS SUNDAY, 2-MORROW IS M-O-N-DAY++++!");
        } else if (date.isEqual(monMessage)) {
            out.println("**** MON-D-A-Y THE 5th! ****");
        } else if (date.isEqual(checkPoint1)) {
            out.println("Project 1 Checkpoints Due.");
        } else if (date.isEqual(wedMessage)) {
            out.println("--- 2 MORE UNTIL WEEKLY *-*");
        } else if (date.isEqual(thuMessage)) {
            out.println("!-- NO CLASS TODAY: FEB 8, 18 --!");
        } else {
            out.println("YOUR SPECIAL DAY IS CLOSE BY");
        }

    }
}
