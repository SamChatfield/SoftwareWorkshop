package com.samchatfield.exercise8Bonus1;

/**
 * Created by Sam on 18/11/2015.
 */
public class DayWeekComponent {

    public DayWeekComponent(DayWeek dayWeek) {
        super();
        DayWeekModel model = new DayWeekModel(dayWeek);
        DayWeekView view = new DayWeekView(model);
    }
}
