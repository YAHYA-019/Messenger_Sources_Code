package com.fasterxml.jackson.databind.ser.std;

import java.util.Calendar;

/* loaded from: CalendarSerializer.class */
public class CalendarSerializer extends DateTimeSerializerBase {
    public static final CalendarSerializer A00 = new DateTimeSerializerBase(null, Calendar.class, null);

    public CalendarSerializer() {
        super(null, Calendar.class, null);
    }
}
